package com.cg.ems.dao;

public interface QueryMapper {
	
	public static final String SELECTQRY1="SELECT * from emp161735";
	public static final String SELECTQRY2="SELECT * from emp161735 WHERE EMP_ID=?";
	public static final String SELECTQRY3="SELECT * from emp161735 WHERE EMP_NAME=?";
	public static final String INSETQRY1="INSERT INTO emp161735 VALUES(111,'Hyndu',34000,'12-jan-1996')";
	public static final String INSETQRY2="INSERT INTO emp161735(emp_id,emp_name,emp_sal)"+"VALUES(111,'Swetha',35000)";
	
	public static final String INSETQRY3="INSERT INTO emp161735(emp_id,emp_name,emp_sal)"+"VALUES(?,?,?)";
	public static final String DELETQRY1="DELETE FROM emp161735 WHERE emp_id = ?";

	public static final String UPDATEQRY1="UPDATE emp161735 SET emp_name=?, emp_sal=? WHERE emp_id=?";
	
	
	
	

}
