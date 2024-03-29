package model;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface Mapper <T> {

	T mapping(ResultSet rs) throws SQLException;
}
