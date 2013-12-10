package com.jiajiao.dao.impl;

import hibernate.orm.Photo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jiajiao.dao.IPhotoDAO;

public class PhotoDAOImpl implements IPhotoDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;

	public PhotoDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean findPhoto(Photo photo) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String userid = photo.getUser().getUserid();
		if (userid != null && !userid.equals("") ) {
			try {
				String sql = "SELECT photo FROM photo WHERE user_userid=?";
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, userid);
				ResultSet rs = this.pstmt.executeQuery();
				if (rs.next()) {
					photo.setPhoto(rs.getString(1));
					flag = true;
				}
			} catch (Exception e) {
				throw e;
			} finally {
				if (this.pstmt != null) {
					try {
						this.pstmt.close();
					} catch (Exception e) {
						throw e;
					}
				}
			}
		}
		return flag;
	}
}