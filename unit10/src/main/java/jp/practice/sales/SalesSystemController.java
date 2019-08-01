package jp.practice.sales;

import java.text.NumberFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes(types = { SalesForm.class })
@RequestMapping(value = "/system")
public class SalesSystemController {
	private static final String INIT = "init";
	private static final String ADD = "add";
	private static final String FIX = "fix";
	private static final String AD = "明細に追加しました。";
	private static final String DLT = "選択された明細行を削除しました。";
	private static final String REG = "以下のように売り上げを登録しました。";
	private static final String ERRMSG = "点数には1以上100以下の整数を入力してください。";
	private static final String ERRMSG2 = "明細行を選択してください。";
	private int flag = 0;

	//private static final String ERR = "数字で入力してください";
	/**
	 *  起動時および登録完了時に呼ばれる。初期画面を表示する。
	 * @param form フォームオブジェクト
	 * @param model モデルオブジェクト
	 * @return Viewとしてinit.jspを指定
	 */
	@RequestMapping(value = "/start")
	public String init(SalesForm form, Model model) {
		model.addAttribute("nameList", RecordManager.makeNameList()); //プルダウンリスト
		form.setGoodsName(RecordManager.getFirstItemName()); //ネーム

		return INIT;
	}

	/**
	* 初期画面から呼ばれる。指定した商品をリストに入れ更新画面を表示する。
	* @param form フォームオブジェクト
	* @param model モデルオブジェクト
	* @return Viewとしてadd.jspとinit.jspを指定
	*/
	@RequestMapping(params = "add")
	public String add(SalesForm form, Model model) {

		Item item = RecordManager.findItem(form.getGoodsName()); //インスタンスを検索
		try {
			int kazu = Integer.parseInt(form.getPoint()); //String型⇒int型に変換
			if (0 < kazu && kazu < 101) {
				flag = 1;
				Item item1 = new Item(item.getId(), item.getName(), item.getPrice(), kazu, item.getPrice() * kazu);
				form.addToAllList(item1); //AllListに追加
				model.addAttribute("AllList", form.getAllList()); //AllList
				model.addAttribute("total", NumberFormat.getInstance().format(form.getTotal())); //合計
				model.addAttribute("nameList", RecordManager.makeNameList());
				form.setGoodsName(RecordManager.getFirstItemName()); //ネーム
				model.addAttribute("message2", AD);
				form.setPoint("1");
				return ADD;
			} else {
				model.addAttribute("nameList", RecordManager.makeNameList());
				model.addAttribute("message1", ERRMSG);
				form.setPoint(form.getPoint());
				if (flag == 0) {
					return INIT;
				} else {
					model.addAttribute("AllList", form.getAllList()); //AllList
					model.addAttribute("total", NumberFormat.getInstance().format(form.getTotal())); //合計
					return ADD;
				}

			}
		} catch (NumberFormatException e) {
			model.addAttribute("nameList", RecordManager.makeNameList());
			model.addAttribute("message1", ERRMSG);
			form.setPoint(form.getPoint());
			if (flag == 0) {
				return INIT;
			} else {
				model.addAttribute("AllList", form.getAllList()); //AllList
				model.addAttribute("total", NumberFormat.getInstance().format(form.getTotal())); //合計
				return ADD;
			}

		}
	}

	/**
	* 参照画面から呼ばれる。指定した商品をリストから削除し更新画面を表示する。
	* @param form フォームオブジェクト
	* @param model モデルオブジェクト
	* @return Viewとしてadd.jspとinit.jspを指定
	*/
	@RequestMapping(params = "delete")
	public String remove(SalesForm form, Model model) {
		if (form.getDelNumber() == 0) { //チェックボタンなしの削除ボタンの処理
			model.addAttribute("message1", ERRMSG2);
			model.addAttribute("AllList", form.getAllList()); //リストを出す
			model.addAttribute("nameList", RecordManager.makeNameList());
			model.addAttribute("total", NumberFormat.getInstance().format(form.getTotal())); //合計
			return ADD;
		} else {
			form.removeToAllList(form.getDelNumber() - 1); //削除を行う。
			model.addAttribute("message2", DLT);
			model.addAttribute("AllList", form.getAllList()); //リストを出す
			model.addAttribute("total", NumberFormat.getInstance().format(form.getTotal())); //合計
			model.addAttribute("nameList", RecordManager.makeNameList());
			form.setDelNumber(0); //ラジオボタンのチェックを外す処理
			form.setPoint("1");
			if (form.getAllList().isEmpty()) {
				flag = 0;
				return INIT;
			} else {
				return ADD;
			}
		}
	}

	/**
	* 参照画面から呼ばれる。リストの画面を表示する。
	* @param form フォームオブジェクト
	* @param model モデルオブジェクト
	* @return Viewとしてfirm.jspを指定
	*/
	@RequestMapping(params = "firm")
	public String firm(SalesForm form, Model model) {
		model.addAttribute("AllList", form.getAllList()); //リストを出す
		model.addAttribute("total", NumberFormat.getInstance().format(form.getTotal())); //合計
		model.addAttribute("message", REG);
		return FIX;
	}

	/**
	* 売上登録画面から呼ばれる。初期画面に戻る。
	* @param form フォームオブジェクト
	* @param model モデルオブジェクト
	* @param sessionStatus セッション管理オブジェクト
	* @return Viewとしてinit.jspを指定
	*/
	@RequestMapping(params = "end")
	public String end(SalesForm form, Model model, SessionStatus sessionStatus) {
		flag = 0;
		form.cleaeToAllList(); //リストをクリア
		model.addAttribute("nameList", RecordManager.makeNameList());
		form.setPoint("1");
		sessionStatus.setComplete();
		return INIT;
	}
}