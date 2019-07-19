package jp.practice.sales;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/system")
public class SalesSystemController {
	private static final String INIT = "init";
	private static final String ADD = "add";
	//private static final String INIMSG = "従業員番号を入力してください";

	@RequestMapping(value = "/start")
	public String init(SalesForm form, Model model) {
		model.addAttribute("message", "予定を変更する人を選択してください。");
		model.addAttribute("nameList", RecordManager.makeNameList());
		return INIT;
	}
	@RequestMapping( params = "add")
	 public String refer(SalesForm form,Model model) {
		 return ADD;
		 }

	 @RequestMapping(params = "toInit")
	 public String toInit(SalesForm form,Model model) {
	 return INIT;
	 }
}
