package com.pro;

public class MacVO {

	private String BurgerName;
	private int BurgerPrice;
	private String BurgerInfo;
	private int CusId;
	private String CusName;
	private String CusPhone;
	private String CusAdd;
	private String CusProName;
	private int CusCount;
	private int CusPrice;
	private int NutG;
	private int NutMl;
	private int NutCal;
	private int NutSugar;
	private int NutProtein;
	private int NutFat;
	private int NutNa;
	private int NutCaff;

	public String getBurgerName() {
		return BurgerName;
	}

	public void setBurgerName(String burgerName) {
		BurgerName = burgerName;
	}

	public int getBurgerPrice() {
		return BurgerPrice;
	}

	public void setBurgerPrice(int burgerPrice) {
		BurgerPrice = burgerPrice;
	}

	public String getBurgerInfo() {
		return BurgerInfo;
	}

	public void setBurgerInfo(String burgerInfo) {
		BurgerInfo = burgerInfo;
	}

	public String getCusName() {
		return CusName;
	}

	public void setCusName(String cusName) {
		CusName = cusName;
	}

	public String getCusPhone() {
		return CusPhone;
	}

	public void setCusPhone(String cusPhone) {
		CusPhone = cusPhone;
	}

	public String getCusProName() {
		return CusProName;
	}

	public void setCusProName(String cusProName) {
		CusProName = cusProName;
	}

	public int getCusPrice() {
		return CusPrice;
	}

	public void setCusPrice(int cusPrice) {
		CusPrice = cusPrice;
	}

	public int getNutG() {
		return NutG;
	}

	public void setNutG(int nutG) {
		NutG = nutG;
	}

	public int getNutMl() {
		return NutMl;
	}

	public void setNutMl(int nutMl) {
		NutMl = nutMl;
	}

	public int getNutCal() {
		return NutCal;
	}

	public void setNutCal(int nutCal) {
		NutCal = nutCal;
	}

	public int getNutSugar() {
		return NutSugar;
	}

	public void setNutSugar(int nutSugar) {
		NutSugar = nutSugar;
	}

	public int getNutProtein() {
		return NutProtein;
	}

	public void setNutProtein(int nutProtein) {
		NutProtein = nutProtein;
	}

	public int getNutFat() {
		return NutFat;
	}

	public void setNutFat(int nutFat) {
		NutFat = nutFat;
	}

	public int getNutNa() {
		return NutNa;
	}

	public void setNutNa(int nutNa) {
		NutNa = nutNa;
	}

	public int getNutCaff() {
		return NutCaff;
	}

	public void setNutCaff(int nutCaff) {
		NutCaff = nutCaff;
	}

	public int getCusId() {
		return CusId;
	}

	public void setCusId(int cusId) {
		CusId = cusId;
	}

	public MacVO(String burgerName, int burgerPrice, String burgerInfo) {
		super();
		BurgerName = burgerName;
		BurgerPrice = burgerPrice;
		BurgerInfo = burgerInfo;
	}

	public String getCusAdd() {
		return CusAdd;
	}

	public void setCusAdd(String cusAdd) {
		CusAdd = cusAdd;
	}

	public int getCusCount() {
		return CusCount;
	}

	public void setCusCount(int cusCount) {
		CusCount = cusCount;
	}

	
	public MacVO(int cusId, String cusName, String cusPhone, String cusAdd, String cusProName, int cusCount,
			int cusPrice) {
		super();
		CusId = cusId;
		CusName = cusName;
		CusPhone = cusPhone;
		CusAdd = cusAdd;
		CusProName = cusProName;
		CusCount = cusCount;
		CusPrice = cusPrice;
	}

	public MacVO(int nutG, int nutMl, int nutCal, int nutSugar, int nutProtein, int nutFat, int nutNa, int nutCaff) {
		super();
		NutG = nutG;
		NutMl = nutMl;
		NutCal = nutCal;
		NutSugar = nutSugar;
		NutProtein = nutProtein;
		NutFat = nutFat;
		NutNa = nutNa;
		NutCaff = nutCaff;
	}

}
