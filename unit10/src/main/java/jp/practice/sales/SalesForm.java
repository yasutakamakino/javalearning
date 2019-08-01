package jp.practice.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesForm {

	private String goodsName;
	private String point = "1";
	private int delNumber = 0;
	private List<Item> AllList = new ArrayList<Item>();
	private int total = 0;

	/**
	 *
	 */
	public SalesForm() {

	}


	/**
	 * @return goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}


	/**
	 * @param goodsName セットする goodsName
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	/**
	 * @return point
	 */
	public String getPoint() {
		return point;
	}


	/**
	 * @param point セットする point
	 */
	public void setPoint(String point) {
		this.point = point;
	}


	/**
	 * @return delNumber
	 */
	public int getDelNumber() {
		return delNumber;
	}


	/**
	 * @param delNumber セットする delNumber
	 */
	public void setDelNumber(int delNumber) {
		this.delNumber = delNumber;
	}


	/**
	 * @return allList
	 */
	public List<Item> getAllList() {
		return AllList;
	}

	/**
	 * @param item  AllListにaddする.
	 */
	public void addToAllList(Item item) {
		AllList.add(item);
	}

	/**
	 * @param delNumber AllListにremoveする.
	 */
	public void removeToAllList(int delNumber) {
		AllList.remove(AllList.get(delNumber));
	}

	/**
	 * @param AllListにclearする.
	 */
	public void cleaeToAllList() {
		AllList.clear();
	}


	/**
	 * @return total
	 */
	public int getTotal() {
		total = 0;
		for (int i = 0; i < AllList.size(); i++) {
			total = total + (AllList.get(i)).getSubtotal();
		}
		return total;
	}

}
