package com.hrportal.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hrportal.dao.DepartmentDAO;
import com.hrportal.dos.DepartmentDO;
import com.hrportal.util.DBUtil;

public class DepartmentDAOImpl implements DepartmentDAO {

	public boolean add(DepartmentDO deptDO) {
		try {
			// @formatter:off
			String sql = "INSERT INTO department (name, category) VALUES " + "('" + deptDO.getName() + "', '"
					+ deptDO.getCategory() + "') ";

			System.out.println(sql);

			// @formatter:on
			boolean inserted = DBUtil.getStatement().execute(sql);
			return inserted;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				DBUtil.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public DepartmentDO fetch(int id) {
		try {
			String sql = "SELECT * FROM department where id = " + id;

			System.out.println(sql);

			ResultSet rs = DBUtil.getStatement().executeQuery(sql);
			DepartmentDO deptDO = new DepartmentDO();
			while (rs.next()) {
				deptDO.setId(rs.getInt(1));
				deptDO.setName(rs.getString(2));
				deptDO.setCategory(rs.getString(3).charAt(0));
			}
			return deptDO;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				DBUtil.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean update(DepartmentDO deptDO) {
		try {
			// @formatter:off
			String sql = "UPDATE department SET " + "name = '" + deptDO.getName() + "', category = '"
					+ deptDO.getCategory() + "' WHERE id = " + deptDO.getId();

			System.out.println(sql);

			// @formatter:on
			boolean updated = DBUtil.getStatement().execute(sql);
			return updated;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				DBUtil.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean delete(int id) {
		try {
			String sql = "DELETE FROM department WHERE id = " + id;

			System.out.println(sql);

			boolean deleted = DBUtil.getStatement().execute(sql);
			return deleted;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				DBUtil.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
