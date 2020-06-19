package com.solvd.carsService.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.carsService.jdbc.connection.Conection;
import com.solvd.carsService.jdbc.dto.ModelsDTO;
import com.solvd.carsService.jdbc.interfaces.JDBCInterface;

public class ModelsDAO implements JDBCInterface<ModelsDTO> {
	
	private final static Logger LOGGER = LogManager.getLogger(ModelsDAO.class);
	// CRUDs
	private static final String SQL_INSERT = "INSERT INTO models (id, description) VALUES(?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM models WHERE id =  ?";
	private static final String SQL_UPDATE = "UPDATE models SET description = ? WHERE id = ?";
	private static final String SQL_READ = "SELECT * FROM models WHERE id = ?";
	private static final String SQL_READALL = "SELECT * FROM models";

	// Using Singleton
	private static final Conection cn = Conection.curStatus();

	@Override
	public boolean create(ModelsDTO t) {
		PreparedStatement ps;
		try {

			ps = cn.getCnn().prepareStatement(SQL_INSERT);
			ps.setString(1, t.getId());
			ps.setString(2, t.getDescription());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			LOGGER.debug("Error occurs");

		} finally {
			cn.closeConnection();

		}

		return false;
	}

	@Override
	public boolean delete(Object key) {
		PreparedStatement ps;
		try {

			ps = cn.getCnn().prepareStatement(SQL_DELETE);
			ps.setString(1, key.toString());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			LOGGER.debug("Error occurs: Cant delete object");
		} finally {
			cn.closeConnection();

		}
		return false;
	}

	@Override
	public boolean update(ModelsDTO t) {
		PreparedStatement ps;
		try {

			ps = cn.getCnn().prepareStatement(SQL_UPDATE);
			ps.setString(1, t.getDescription());
			ps.setString(2, t.getId());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			LOGGER.debug("Error occurs: Cant update");
		} finally {
			cn.closeConnection();

		}
		return false;
	}

	@Override
	public ModelsDTO read(Object ob) {

		PreparedStatement ps;
		ResultSet res;
		ModelsDTO mod = null;

		try {
			ps = cn.getCnn().prepareStatement(SQL_READ);

			ps.setString(1, ob.toString());

			res = ps.executeQuery();

			while (res.next()) {
				mod = new ModelsDTO(res.getString(1), res.getString(2));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.debug("Error occurs: Cant read");
		} finally {
			cn.closeConnection();

		}
		return mod;
	}

	@Override
	public List<ModelsDTO> readAll() {

		PreparedStatement ps;
		ResultSet res;
		ArrayList<ModelsDTO> models = new ArrayList();

		try {
			ps = cn.getCnn().prepareStatement(SQL_READALL);
			res = ps.executeQuery();

			while (res.next()) {
				models.add(new ModelsDTO(res.getString(1), res.getString(2)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.debug("Error occurs: Cant list ");
		}

		finally {
			cn.closeConnection();
		}

		return models;
	}

}
