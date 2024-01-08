package com.divs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.divs.bo.EmployeeBO;
import com.zaxxer.hikari.HikariDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "dao")
public class EmployeeDaoImpl implements IEmployeeDao{
	
	private static final String SQL_INSERT="insert into employee(`ename`,`eage`,`eaddress`,`esalary`,`ehike`) values(?,?,?,?,?)";
	
	static {
		System.out.println("EmployeeDaoImpl class is loading..");
	}
	
	public EmployeeDaoImpl() {
		System.out.println("EmployeeDaoImpl is instantiated...");
	}
	
	@Autowired
	private HikariDataSource datasource;

	@Override
	public String toString() {
		return "EmployeeDaoImpl [datasource=" + datasource + "]";
	}

	@Override
	public EmployeeBO save(EmployeeBO bo) {
		EmployeeBO boResult=new EmployeeBO();
		try {
			Connection con=datasource.getConnection();
			PreparedStatement pstmt=con.prepareStatement(SQL_INSERT);
			pstmt.setString(1, bo.geteName());
			pstmt.setInt(2, bo.geteAge());
			pstmt.setString(3, bo.geteAddress());
			pstmt.setFloat(4, bo.geteSalary());
			pstmt.setFloat(5, bo.geteHike());
			int count=pstmt.executeUpdate();
			
			if(count>0) {
				System.out.println("successfully inserted to DB..");
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from employee where ename='"+bo.geteName()+"'");
				while(rs.next()) {
					boResult.seteId(rs.getInt(1));
					boResult.seteName(rs.getString(2));
					boResult.seteAddress(rs.getString(3));
					boResult.seteSalary(rs.getFloat(4));
					boResult.seteHike(rs.getFloat(5));
					boResult.seteAge(rs.getInt(6));
				}
			}else {
				System.out.println("failed to insert");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return boResult;
	}

	

}
