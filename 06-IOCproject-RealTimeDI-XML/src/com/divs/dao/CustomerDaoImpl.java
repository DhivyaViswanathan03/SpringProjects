package com.divs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.divs.bo.CustomerBo;
import com.mysql.cj.xdevapi.PreparableStatement;

public class CustomerDaoImpl implements ICustomerDao {
	
	private DataSource dataSource;
	
	private static String INSERT_QUERY="insert into customer(`cname`,`caddress`,`pamt`,`rate`,`time`,`intrAmount`)values(?,?,?,?,?,?)";
	
	
	static {
		System.out.println("CustomerDaoImpl is loading...");
	}
	
	public CustomerDaoImpl() {
		System.out.println("CustomerDaoImpl 0 param is called");
	}

	public CustomerDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("CustomerDaoImpl 1 param is called..");
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public String toString() {
		return "CustomerDaoImpl [dataSource=" + dataSource + "]";
	}

	@Override
	public int save(CustomerBo bo) throws Exception {
		Connection con=dataSource.getConnection();
		int count=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(INSERT_QUERY);
			pstmt.setString(1, bo.getCusName());
			pstmt.setString(2, bo.getCusAddr());
			pstmt.setFloat(3, bo.getpAmt());
			pstmt.setFloat(4, bo.getRate());
			pstmt.setFloat(5, bo.getTime());
			pstmt.setFloat(6, bo.getIntrAmount());
			
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		}
		
		return count;
	}

}
