package it.unina.Applicativo.postgresDAO;

import java.sql.Connection;
import java.sql.SQLException;

import it.unina.Applicativo.dao.DAOExample;
import it.unina.Applicativo.database.DatabaseConnection;

public class PostgresDAO implements DAOExample {

    private Connection connection;

    public PostgresDAO() {
		try {
			connection = DatabaseConnection.getInstance().connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getExampleById(int id){

        /*example sql query
        ...
        connection.prepareStatement("SELECT example_column FROM example_table WHERE id = ?");
        ...
        */

        return "example";

    }

}
