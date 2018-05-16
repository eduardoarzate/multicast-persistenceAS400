package mx.com.actinver.multicast.persistence.basededatos;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Eduardo Arzate
 *
 */

public class BasedeDatos implements PersistenciaBasedeDatos{
	
	// Servicios inyectados
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	// Sentencias SQL
	private final static String INSERT_BWPMOF = "AGREGAR CONSULTA SQL INSERT";
	
	@Override
	public void registraEnBWPMOF() {
		int filasInsertadas = 0;
		try {
			
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPMOF, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			
		}
		
	}

}
