package com.beans;

public class CollegeBean {
		private int ID;
		private String Name;
		private String Code;
		private String Year;
		private String Branch;
		private String Rank;
		private String Open;
		private String Obc;
		private String ScSt;
		
		
		public CollegeBean() {
			super();
		}

		public CollegeBean(int iD, String name, String code, String year, String branch, String rank, String open,
				String obc, String scSt) {
			super();
			ID = iD;
			Name = name;
			Code = code;
			Year = year;
			Branch = branch;
			Rank = rank;
			Open = open;
			Obc = obc;
			ScSt = scSt;
		}

		public CollegeBean(String name, String code, String year, String branch, String rank, String open, String obc,
				String scSt) {
			super();
			Name = name;
			Code = code;
			Year = year;
			Branch = branch;
			Rank = rank;
			Open = open;
			Obc = obc;
			ScSt = scSt;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getCode() {
			return Code;
		}

		public void setCode(String code) {
			Code = code;
		}

		public String getYear() {
			return Year;
		}

		public void setYear(String year) {
			Year = year;
		}

		public String getBranch() {
			return Branch;
		}

		public void setBranch(String branch) {
			Branch = branch;
		}

		public String getRank() {
			return Rank;
		}

		public void setRank(String rank) {
			Rank = rank;
		}

		public String getOpen() {
			return Open;
		}

		public void setOpen(String open) {
			Open = open;
		}

		public String getObc() {
			return Obc;
		}

		public void setObc(String obc) {
			Obc = obc;
		}

		public String getScSt() {
			return ScSt;
		}

		public void setScSt(String scSt) {
			ScSt = scSt;
		}
	
		
}	
		