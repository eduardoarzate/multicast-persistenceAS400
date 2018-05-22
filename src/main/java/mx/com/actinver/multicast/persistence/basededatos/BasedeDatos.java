package mx.com.actinver.multicast.persistence.basededatos;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import mx.com.actinver.biva.persistencia.basededatos.BaseDeDatos;
import mx.com.actinver.multicast.error.ErrorDeBaseDeDatos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Eduardo Arzate
 *
 */

public class BasedeDatos implements PersistenciaBasedeDatos{
	
	// Servicios inyectados
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	// Campos de los mapas de parametros
	private final static String ISIN = "isin";
	private final static String PC1 = "pc1";
	private final static String PC2 = "pc2";
	private final static String PC3 = "pc3";
	private final static String PC4 = "pc4";
	private final static String PC5 = "pc5";
	private final static String PC6 = "pc6";
	private final static String PC7 = "pc7";
	private final static String PC8 = "pc8";
	private final static String PC9 = "pc9";
	private final static String PC10 = "pc10";
	private final static String OC1 = "oc1";
	private final static String OC2 = "oc2";
	private final static String OC3 = "oc3";
	private final static String OC4 = "oc4";
	private final static String OC5 = "oc5";
	private final static String OC6 = "oc6";
	private final static String OC7 = "oc7";
	private final static String OC8 = "oc8";
	private final static String OC9 = "oc9";
	private final static String OC10 = "oc10";
	private final static String VC1 = "vc1";
	private final static String VC2 = "vc2";
	private final static String VC3 = "vc3";
	private final static String VC4 = "vc4";
	private final static String VC5 = "vc5";
	private final static String VC6 = "vc6";
	private final static String VC7 = "vc7";
	private final static String VC8 = "vc8";
	private final static String VC9 = "vc9";
	private final static String VC10 = "vc10";
	private final static String PV1 = "pv1";
	private final static String PV2 = "pv2";
	private final static String PV3 = "pv3";
	private final static String PV4 = "pv4";
	private final static String PV5 = "pv5";
	private final static String PV6 = "pv6";
	private final static String PV7 = "pv7";
	private final static String PV8 = "pv8";
	private final static String PV9 = "pv9";
	private final static String PV10 = "pv10";
	private final static String OV1 = "ov1";
	private final static String OV2 = "ov2";
	private final static String OV3 = "ov3";
	private final static String OV4 = "ov4";
	private final static String OV5 = "ov5";
	private final static String OV6 = "ov6";
	private final static String OV7 = "ov7";
	private final static String OV8 = "ov8";
	private final static String OV9 = "ov9";
	private final static String OV10 = "ov10";
	private final static String VV1 = "vv1";
	private final static String VV2 = "vv2";
	private final static String VV3 = "vv3";
	private final static String VV4 = "vv4";
	private final static String VV5 = "vv5";
	private final static String VV6 = "vv6";
	private final static String VV7 = "vv7";
	private final static String VV8 = "vv8";
	private final static String VV9 = "vv9";
	private final static String VV10 = "vv10";
	private final static String TVOVTA = "tvovta";
	private final static String TXPTVT = "txptvt";
	private final static String TVOCOM = "tvocom";
	private final static String TXPTCO = "txptco";
	private final static String THORA = "thora";
	private final static String TEMI = "temi";
	private final static String TSER = "tser";
	private final static String TTREG = "ttreg";
	private final static String TNUMRE = "tnumre";
	private final static String TTRANS = "ttrans";
	private final static String BVTTV = "bvttv";
	private final static String TXSER = "txser";
	private final static String TTPOPE = "ttpope";
	private final static String TDIPZO = "tdipzo";
	private final static String TLIQ = "tliq";
	private final static String TTPMON = "ttpmon";
	private final static String TCUPON = "tcupon";
	private final static String TREST = "trest";
	private final static String NOMTRC = "nomtrc";
	private final static String PRECIO = "precio";
	private final static String TMUEST  = "tmuest ";
	private final static String TSECTO = "tsecto";
	private final static String TRAMO = "tramo";
	private final static String HORIND = "horind";
	private final static String TVOLIS = "tvolis";
	private final static String TINDC = "tindc";
	private final static String TVARIA = "tvaria";
	private final static String TPORCE = "tporce";
	private final static String TTENDE = "ttende";
	private final static String BVEDOI = "bvedoi";
	private final static String HORREC = "horrec";
	private final static String PRECIO_TEORICO = "precio_teorico";
	private final static String HORAORIGEN = "horaorigen";
	private final static String NUMERO_TRAC = "numero_trac";
	private final static String PREINI = "preini";
	private final static String PREULT = "preult";
	private final static String PORVAR = "porvar";
	private final static String TFECRE = "tfecre";
	private final static String VOLCOM = "volcom";
	private final static String NOPCV = "nopcv";
	private final static String IMPCOM = "impcom";
	private final static String VOLCRU = "volcru";
	private final static String NOPCR = "nopcr";
	private final static String IMPCRU = "impcru";
	private final static String TXPRE2 = "txpre2";
	private final static String HORMAX = "hormax";
	private final static String TXPRE3 = "txpre3";
	private final static String HORMIN = "hormin";
	private final static String TXPPRO = "txppro";
	private final static String BIDPRICE = "bidprice";
	private final static String BIDSIZE = "bidsize";
	private final static String BIDTIME = "bidtime";
	private final static String ASKPRICE = "askprice";
	private final static String ASKTIME = "asktime";
	private final static String ASKSIZE = "asksize";
	private final static String LASTN = "lastn";
	private final static String LASTTIME = "lasttime";
	private final static String TRDSIZE = "trdsize";
	private final static String TRDVALUE = "trdvalue";
	private final static String TRDPROME = "trdprome";
	private final static String CLOSEPRC = "closeprc";
	private final static String MAXPRICE = "maxprice";
	private final static String MAXTIME = "maxtime";
	private final static String MINPRICE = "minprice";
	private final static String MINTIME = "mintime";
	private final static String PCTLVC = "pctlvc";
	private final static String EMISORA = "emisora";
	private final static String SERIE = "serie";
	private final static String HORA = "hora";
	private final static String ESTADO = "estado";
	private final static String NUMERO_INSTRUMENTO = "numero_instrumento";
	private final static String TIPO_VALOR = "tipo_valor";
	private final static String ULTIMO_PRECIO = "ultimo_precio";
	private final static String PPP = "ppp";
	private final static String FECHA_REFERENCIA = "fecha_referencia";
	private final static String REFERENCIA = "referencia";
	private final static String CUPON = "cupon";
	private final static String BURSATILIDAD = "bursatilidad";
	private final static String BURSATILIDAD_NUMERICA = "bursatilidad_numerica";
	private final static String MERCADO = "mercado";
	private final static String VOLUMEN = "volumen";
	private final static String EMISION = "emision";
	private final static String FECHA_EMISION = "fecha_emision";
	private final static String FECHA_VENCIMIENTO = "fecha_vencimiento";
	private final static String PLAZO = "plazo";
	private final static String HORA_HECHO = "hora_hecho";
	private final static String TIPO_CONCERTACION = "tipo_concertacion";
	private final static String FOLIO_HECHO = "folio_hecho";
	private final static String FIJA_PRECIO = "fija_precio";
	private final static String TIPO_OPERACION = "tipo_operacion";
	private final static String IMPORTE = "importe";
	private final static String COMPRA = "compra";
	private final static String VENDE = "vende";
	private final static String LIQUIDACION = "liquidacion";
	private final static String REGISTRO = "registro";
	private final static String SECTOR = "sector";
	private final static String SUBSECTOR = "subsector";
	private final static String RAMO = "ramo";
	private final static String SUBRAMO = "subramo";
	private final static String OPERADORA = "operadora";
	private final static String PRECIO_REFERENCIA = "precio_referencia";
	private final static String CALIFICACION = "calificacion";
	private final static String ESTATUS = "estatus";
	private final static String NOMBRE_TRAC = "nombre_trac";
	private final static String TITULOS = "titulos";
	private final static String TITULOS_EXCLUIDOS = "titulos_excluidos";
	private final static String COMPONENTE_EFECTIVO = "componente_efectivo";
	private final static String VALOR_EXCLUIDO = "valor_excluido";
	private final static String NUMERO_CERTIFICADOS = "numero_certificados";
	private final static String TIPO_WARRANT = "tipo_warrant";
	private final static String PRECIO_EJERCICIO = "precio_ejercicio";

	
	// Sentencias SQL
	private final static String INSERT_BMV_WARRANTS = "INSERT INTO BMV_WARRANTS (NUMERO_INSTRUMENTO,TIPO_VALOR,EMISORA,SERIE,TIPO_WARRANT,FECHA_VENCIMIENTO,PRECIO_EJERCICIO,PRECIO_REFERENCIA,FECHA_REFERENCIA,REFERENCIA,ISIN,HORAORIGEN) VALUES(:numero_instrumento,:tipo_valor,:emisora,:serie,:tipo_warrant,:fecha_vencimiento,:precio_ejercicio,:precio_referencia,:fecha_referencia,:referencia,:isin,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)";
	private final static String INSERT_BMV_TRAC = "INSERT INTO BMV_TRAC (NUMERO_TRAC,NOMBRE_TRAC,EMISORA,SERIE,TITULOS,TITULOS_EXCLUIDOS,PRECIO,COMPONENTE_EFECTIVO,VALOR_EXCLUIDO,NUMERO_CERTIFICADOS,PRECIO_TEORICO,HORAORIGEN) VALUES(:numero_trac,:nombre_trac,:emisora,:serie,:titulos,:titulos_excluidos,:precio,:componente_efectivo,:valor_excluido,:numero_certificados,:precio_teorico,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)";
	private final static String INSERT_BMV_ESTADO_INSTRUMENTO = "INSERT INTO BMV_ESTADO_INSTRUMENTO(NUMERO_INSTRUMENTO,ESTATUS,HORAORIGEN,NUMERO_INSTRUMENTO) VALUES(:numero_instrumento,:estatus,:horaorigen,:numero_instrumento,CURRENT_TIMESTAMP)";
	private final static String INSERT_BMV_SOCIEDADES_INVERSION = "INSERT INTO BMV_SOCIEDADES_INVERSION(NUMERO_INSTRUMENTO,TIPO_VALOR,EMISORA,SERIE,SECTOR,SUBSECTOR,RAMO,SUBRAMO,OPERADORA,PRECIO_REFERENCIA,FECHA_REFERENCIA,REFERENCIA,ISIN,CALIFICACION,HORAORIGEN) VALUES(:numero_instrumento,:tipo_valor,:emisora,:serie,:sector,:subsector,:ramo,:subramo,:operadora,:precio_referencia,:fecha_referencia,:referencia,:isin,:calificacion,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)";
	private final static String INSERT_BMV_UHECHO = "INSERT INTO BMV_UHECHO (NUMERO_INSTRUMENTO,HORA_HECHO,VOLUMEN,PRECIO,TIPO_CONCERTACION,FOLIO_HECHO,FIJA_PRECIO,TIPO_OPERACION,IMPORTE,COMPRA,VENDE,LIQUIDACION,HORAORIGEN) VALUES(:numero_instrumento,:hora_hecho,:volumen,:precio,:tipo_concertacion,:folio_hecho,:fija_precio,:tipo_operacion,:importe,:compra,:vende,:liquidacion,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)";
	private final static String INSERT_BMV_DEUDA = "INSERT INTO BMV_DEUDA (NUMERO_INSTRUMENTO,TIPO_VALOR,EMISORA,EMISION,FECHA_EMISION,FECHA_VENCIMIENTO,PRECIO,FECHA_REFERENCIA,REFERENCIA,PLAZO,CUPON,ISIN,MERCADO,HORAORIGEN) VALUES(:numero_instrumento,:tipo_valor,:emisora,:emision,:fecha_emision,:fecha_vencimiento,:precio,:fecha_referencia,:referencia,:plazo,:cupon,:isin,:mercado,CURRENT_TIMESTAMP)";
	private final static String INSERT_BMV_CORRO_VENTA = "INSERT INTO BMV_CORRO_VENTA (NUMERO_INSTRUMENTO,VOLUMEN,PRECIO) VALUES (:numero_instrumento,:volumen,:precio)";
	private final static String INSERT_BMV_CORRO_COMPRA = "INSERT INTO BMV_CORRO_COMPRA (NUMERO_INSTRUMENTO,VOLUMEN,PRECIO) VALUES (:numero_instrumento,:volumen,:precio)";
	private final static String INSERT_BMV_ACCIONARIO = "INSERT INTO BMV_ACCIONARIO(NUMERO_INSTRUMENTO,TIPO_VALOR,EMISORA,SERIE,ULTIMO_PRECIO,PPP,FECHA_REFERENCIA,REFERENCIA,CUPON,BURSATILIDAD,BURSATILIDAD_NUMERICA,ISIN,MERCADO,HORAORIGEN) VALUES(:numero_instrumento,:tipo_valor,:emisora,:serie,:ultimo_precio,:ppp,:fecha_referencia,:referencia,:cupon,:bursatilidad,:bursatilidad_numerica,:isin,:mercado,CURRENT_TIMESTAMP)";
	private final static String INSERT_TRMPRFV = "INSERT INTO TRMPRFV (EMISORA,SERIE,HORA,ESTADO,PC1,PC2,PC3,PC4,PC5,PC6,PC7,PC8,PC9,PC10,OC1,OC2,OC3,OC4,OC5,OC6,OC7,OC8,OC9,OC10,VC1,VC2,VC3,VC4,VC5,VC6,VC7,VC8,VC9,VC10) VALUES(:emisora,:serie,:hora,:estado,:pc1,:pc2,:pc3,:pc4,:pc5,:pc6,:pc7,:pc8,:pc9,:pc10,:oc1,:oc2,:oc3,:oc4,:oc5,:oc6,:oc7,:oc8,:oc9,:oc10,:vc1,:vc2,:vc3,:vc4,:vc5,:vc6,:vc7,:vc8,:vc9,:vc10)";
	private final static String INSERT_TRMPRFC = "INSERT INTO TRMPRFC (EMISORA,SERIE,HORA,ESTADO,PC1,PC2,PC3,PC4,PC5,PC6,PC7,PC8,PC9,PC10,OC1,OC2,OC3,OC4,OC5,OC6,OC7,OC8,OC9,OC10,VC1,VC2,VC3,VC4,VC5,VC6,VC7,VC8,VC9,VC10) VALUES(:emisora,:serie,:hora,:estado,:pc1,:pc2,:pc3,:pc4,:pc5,:pc6,:pc7,:pc8,:pc9,:pc10,:oc1,:oc2,:oc3,:oc4,:oc5,:oc6,:oc7,:oc8,:oc9,:oc10,:vc1,:vc2,:vc3,:vc4,:vc5,:vc6,:vc7,:vc8,:vc9,:vc10)";
	private final static String INSERT_TRMUHECH = "INSERT INTO TRMUHECH (ISIN,LASTN,LASTTIME,TRDSIZE,TRDVALUE,TRDPROME,CLOSEPRC,MAXPRICE,MAXTIME,MINPRICE,MINTIME,PCTLVC) VALUES (:isin,:lastn,:lasttime,:trdsize,:trdvalue,:trdprome,:closeprc,:maxprice,:maxtime,:minprice,:mintime,:pctlvc)";
	private final static String INSERT_TRMCORRO = "INSERT INTO TRMCORRO (ISIN,BIDPRICE,BIDSIZE,BIDTIME,ASKPRICE,ASKTIME,ASKSIZE VALUES(:isin,:bidprice,:bidsize,:bidtime,:askprice,:asktime,:asksize)";
	private final static String INSERT_BWPM202 = "INSERT INTO BWPM202 (BVTTV,TEMI,TSER,TCUPON,PREINI,PREULT,PORVAR,TVOVTA,TXPTVT,TVOCOM,TXPTCO,THORA,TFECRE,VOLCOM,NOPCV,IMPCOM,VOLCRU,NOPCR,IMPCRU,TXPRE2,HORMAX,TXPRE3,HORMIN,TXPPRO) VALUES(bvttv,:temi,:tser,:tcupon,:preini,:preult,:porvar,:tvovta,:txptvt,:tvocom,:txptco,:thora,:tfecre,:volcom,:nopcv,:impcom,:volcru,:nopcr,:impcru,:txpre2,:hormax,:txpre3,:hormin,:txppro)";
	private final static String INSERT_BWPM20 = "INSERT INTO BWPM20 (BVTTV,TEMI,TSER,TCUPON,PREINI,PREULT,PORVAR,TVOVTA,TXPTVT,TVOCOM,TXPTCO,THORA,TFECRE,VOLCOM,NOPCV,IMPCOM,VOLCRU,NOPCR,IMPCRU,TXPRE2,HORMAX,TXPRE3,HORMIN,TXPPRO) VALUES (:bvttv,:temi,:tser,:tcupon,:preini,:preult,:porvar,:tvovta,:txptvt,:tvocom,:txptco,:thora,:tfecre,:volcom,:nopcv,:impcom,:volcru,:nopcr,:impcru,:txpre2,:hormax,:txpre3,:hormin,:txppro)";
	private final static String INSERT_BVDTRC2 = "INSERT INTO BVDTRC2 (PRECIO_TEORICO,HORAORIGEN,NUMERO_TRAC) VALUES(:precio_teorico,:horaorigen,:numero_trac)";
	private final static String INSERT_BVISEF = "INSERT INTO BVISEF (TTREG,TNUMRE,TMUEST,TSECTO,TRAMO,HORIND,TVOLIS,TINDC,TVARIA,TPORCE,TTENDE,BVEDOI,HORREC) VALUES(:ttreg,:tnumre,:tmuest,:tsecto,:tramo,:horind,:tvolis,:tindc,:tvaria,:tporce,:ttende,:bvedoi,:horrec)";
	private final static String INSERT_BVDTRC = "INSERT INTO BVDTRC (NOMTRC,PRECIO) VALUES(:nomtrc,:precio)";
	private final static String INSERT_BVORDF = "INSERT INTO BVORDF (TTREG,TNUMRE,TTRANS,BVTTV,TEMI,TXSER,TTPOPE,TDIPZO,TLIQ,TTPMON,TVOVTA,TXPTVT,TVOCOM,TXPTCO,THORA,TCUPON,TREST) VALUES(:ttreg,:tnumre,:ttrans,:bvttv,:temi,:txser,:ttpope,:tdipzo,:tliq,:ttpmon,:tvovta,:txptvt,:tvocom,:txptco,:thora,:tcupon,:trest)";
	private final static String INSERT_BWPMOO = "INSERT INTO BWPMOO (TVOVTA,TXPTVT,TVOCOM,TXPTCO,THORA,TEMI,TSER) VALUES(:tvovta,:txptvt,:tvocom,:txptco,:thora,:temi,:tser)";
	private final static String INSERT_BWPMOF = "INSERT INTO BWPMOF (TVOVTA,TXPTVT,TVOCOM,TXPTCO,THORA,TEMI,TSER) VALUES (:tvovta,:txptvt,:tvocom,:txptco,:thora,:temi,:tser)";
	
	// Mensajes a consola
	private static final Logger LOGGER = LoggerFactory.getLogger(BasedeDatos.class);
	private final static String ERROR_NOTIF_EMISORA_NULA = "La notificacion de emisora recibida es nula.";
	private final static String ERROR_NOTIF_PROFUNDIDAD_NULA = "La notificacion de profundidad es nula";
	private final static String ERROR_NOTIF_INDICE_NULA = "La notificacion de indice es nula";
	private final static String ERROR_NOTIF_TRACS_NULA = "La notificacion de tracs es nula";
	private final static String ERROR_COMPRAS_NULO = "El arreglo de compras es nulo.";
	private final static String ERROR_VENTAS_NULO = "El arreglo de ventas es nulo.";
	private final static String ERROR_ORDENES_NULO = "El arreglo de ordenes es nulo.";
	private final static String ERROR_MENSAJE_c = "Mensaje c nulo";
	private final static String ERROR_MENSAJE_e = "Mensaje e nulo";
	private final static String ERROR_MENSAJE_4 = "Mensaje 4 nulo";
	private final static String ERROR_MENSAJE_f = "Mensaje f nulo";
	private final static String ERROR_MENSAJE_P = "Mensaje P nulo";
	private final static String ERROR_MENSAJE_b = "Mensaje b nulo";
	private final static String ERROR_MENSAJE_o = "Mensaje o nulo";
	private final static String ERROR_MENSAJE_a = "Mensaje a nulo";
	
	private final static String MENSAJE_INSERT_BMV_WARRANTS = "Insertando en BMV_WARRANTS";
	private final static String MENSAJE_INSERT_BMV_TRAC = "Insertando en BMV_TRAC";
	private final static String MENSAJE_INSERT_BMV_ESTADO_INSTRUMENTO = "Insertando en BMV_ESTADO_INSTRUMENTO";
	private final static String MENSAJE_INSERT_BMV_SOCIEDADES_INVERSION = "Insertando en BMV_SOCIEDADES_INVERSION";
	private final static String MENSAJE_INSERT_BMV_UHECHO = "Insertando en BMV_UHECHO";
	private final static String MENSAJE_INSERT_BMV_DEUDA = "Insertando en BMV_DEUDA";
	private final static String MENSAJE_INSERT_BMV_CORRO_VENTA = "Insertando en BMV_CORRO_VENTA";
	private final static String MENSAJE_INSERT_BMV_CORRO_COMPRA = "Insertando en BMV_CORRO_COMPRA";
	private final static String MENSAJE_INSERT_BMV_ACCIONARIO = "InseRtando en BMV_ACCIONARIO";
	private final static String MENSAJE_INSERT_TRMPRFV = "Insertando en TRMPRFV";
	private final static String MENSAJE_INSERT_TRMPRFC = "Inserrtando en TRMPRFC";
	private final static String MENSAJE_INSERT_TRMUHECH = "Insertnado en TRMUHECH";
	private final static String MENSAJE_INSERT_TRMCORRO = "Insertando en TRMCORRO";
	private final static String MENSAJE_INSERT_BWPM202 = "Insertando en BWPM202";
	private final static String MENSAJE_INSERT_BWPM20 = "Insertando en MWOM20";
	private final static String MENSAJE_INSERT_BVDTRC2 = "Insertando en BVDTRC2";
	private final static String MENSAJE_INSERT_BVISEF = "Insertando en BVISEF";
	private final static String MENSAJE_INSERT_BVDTRC = "Insertando en BVDTRC";
	private final static String MENSAJE_INSERT_BVORDF = "Insertando en BVORDF";
	private final static String MENSAJE_INSERT_BWPMOO = "Insertando en BWPMOO";
	private final static String MENSAJE_INSERT_BWPMOF = "Insertnado en BWPMOF";
	
	private final static String ERROR_INSERT_BMV_WARRANTS = "Error al insertar en BMV_WARRANTS";
	private final static String ERROR_INSERT_BMV_TRAC = "Error al insertar en BMV_TRAC";
	private final static String ERROR_INSERT_BMV_ESTADO_INSTRUMENTO = "Error al insertar en BMV_ESTADO_INSTRUMENTO";
	private final static String ERROR_INSERT_BMV_SOCIEDADES_INVERSION = "Error al insertar en BMV_SOCIEDADES_INVERSION";
	private final static String ERROR_INSERT_BMV_UHECHO = "Error al insertar en BMV_UHECHO";
	private final static String ERROR_INSERT_BMV_DEUDA = "Error al insertar en BMV_DEUDA";
	private final static String ERROR_INSERT_BMV_CORRO_VENTA = "Error al insertar en BMV_CORRO_VENTA";
	private final static String ERROR_INSERT_BMV_CORRO_COMPRA = "Error al insertar en BMV_CORRO_COMPRA";
	private final static String ERROR_INSERT_BMV_ACCIONARIO = "Error al insertar en BMV_ACCIONARIO";
	private final static String ERROR_INSERT_TRMPRFV = "Error al insertar en TRMPRFV";
	private final static String ERROR_INSERT_TRMPRFC = "Inserrtando en TRMPRFC";
	private final static String ERROR_INSERT_TRMUHECH = "Insertnado en TRMUHECH";
	private final static String ERROR_INSERT_TRMCORRO = "Error al insertar en TRMCORRO";
	private final static String ERROR_INSERT_BWPM202 = "Error al insertar en BWPM202";
	private final static String ERROR_INSERT_BWPM20 = "Error al insertar en MWOM20";
	private final static String ERROR_INSERT_BVDTRC2 = "Error al insertar en BVDTRC2";
	private final static String ERROR_INSERT_BVISEF = "Error al insertar en BVISEF";
	private final static String ERROR_INSERT_BVDTRC = "Error al insertar en BVDTRC";
	private final static String ERROR_INSERT_BVORDF = "Error al insertar en BVORDF";
	private final static String ERROR_INSERT_BWPMOO = "Error al insertar en BWPMOO";
	private final static String ERROR_INSERT_BWPMOF = "Error al insertar en BWPMOF";
	
	@Override
	public Boolean registraEnBWPMOF(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos{
		int filasInsertadas = 0;
		Statement stmt = null;
		if(notificacionDeEmisora == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_EMISORA_NULA);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BWPMOF);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BWPMOF WHERE ISIN = :isin";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPMOF, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPMOF, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BWPMOF, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_WARRANTS(c mensajec) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajec == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_c);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_WARRANTS);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_WARRANTS WHERE NUMERO_INSTRUMENTO = :numero_instrumento";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_WARRANTS, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_WARRANTS, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_WARRANTS, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_TRAC(e mensajee) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajee == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_e);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_TRAC);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_TRAC WHERE NUMERO_TRAC = :numero_trac and EMISORA = :emisora  and SERIE = :serie";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_TRAC, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_TRAC, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_TRAC, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_ESTADO_INSTRUMENTO(cuatro mensaje4) {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensaje4 == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_4);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_ESTADO_INSTRUMENTO);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_ESTADO_INSTRUMENTO WHERE NUMERO_INSTRUMENTO = :numero_instrumento";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_ESTADO_INSTRUMENTO, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_ESTADO_INSTRUMENTO, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_ESTADO_INSTRUMENTO, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_SOCIEDADES_INVERSION(f mensajef) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajef == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_f);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_SOCIEDADES_INVERSION);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_SOCIEDADES_INVERSION WHERE NUMINST = :numinst";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_SOCIEDADES_INVERSION, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_SOCIEDADES_INVERSION, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_SOCIEDADES_INVERSION, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_UHECHO(P mensajeP) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajeP == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_P);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_UHECHO);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_UHECHO WHERE REGISTRO = :registro";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_UHECHO, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_UHECHO, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_UHECHO, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_DEUDA(b mensajeb) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajeb == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_b);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_DEUDA);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_DEUDA WHERE NUMERO_INSTRUMENTO = :numero_instrumento";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_DEUDA, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_DEUDA, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_DEUDA, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_CORRO_VENTA(o mensajeo) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajeo == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_o);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_CORRO_VENTA);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_CORRO_VENTA WHERE REGISTRO = :registro";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_CORRO_VENTA, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_CORRO_VENTA, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_CORRO_VENTA, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_CORRO_COMPRA(o mensajeo) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajeo == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_o);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_CORRO_COMPRA);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_CORRO_COMPRA WHERE REGISTRO = :registro";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_CORRO_COMPRA, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_CORRO_COMPRA, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_CORRO_COMPRA, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBMV_ACCIONARIO(a mensajea) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(mensajea == null) {
			throw new ErrorDeBaseDeDatos(ERROR_MENSAJE_a);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_BMV_ACCIONARIO);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM BMV_ACCIONARIO WHERE NUMINST = :numinst";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_ACCIONARIO, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BMV_ACCIONARIO, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BMV_ACCIONARIO, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnTRMPRFV(Profundidad notificacionDeProfundidad) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(notificacionDeProfundidad == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_PROFUNDIDAD_NULA);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_TRMPRFV);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM TRMPRFV WHERE EMISORA = :emisora and SERIE = :serie";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMPRFV, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMPRFV, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_TRMPRFV, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnTRMPRFC(Profundidad notificacionDeProfundidad) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(notificacionDeProfundidad == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_PROFUNDIDAD_NULA);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_TRMPRFC);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM TRMPRFC WHERE EMISORA = :emisora and SERIE = :serie";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMPRFC, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMPRFC, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_TRMPRFC, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnTRMUHECH(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(notificacionDeEmisora == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_EMISORA_NULA);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_TRMUHECH);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM TRMUHECH WHERE ISIN = :isin";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMUHECH, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMUHECH, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_TRMUHECH, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnTRMCORRO(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		Statement stmt = null;
		if(notificacionDeEmisora == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_EMISORA_NULA);
		}else {
		
		try {
			
			LOGGER.debug(MENSAJE_INSERT_TRMCORRO);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
			String sql = "SELECT * FROM TRMCORRO WHERE ISIN = :isin";
	        ResultSet rs = stmt.executeQuery(sql);
	        
	        if(rs.getRow() != 0) {
	        	//mapear los campos
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMCORRO, mapSqlParameterSource);
	        }else {
	        	//mapear para actualizar
	        	filasInsertadas = namedParameterJdbcTemplate.update(INSERT_TRMCORRO, mapSqlParameterSource);
	        }
	        
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_TRMCORRO, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public void registraEnBWPM202(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		try {
			
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPM202, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			
		}
		
	}

	@Override
	public void registraEnBWPM20(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		try {
			
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPM20, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			
		}
		
	}

	@Override
	public void registraEnBVDTRC2(Tracs notificacionDeTracs) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		try {
			
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BVDTRC2, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			
		}
		
	}

	@Override
	public Boolean registraEnBVISEF(Indice notificacionDeIndice) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		if(notificacionDeIndice == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_INDICE_NULA);
		}else {
		try {
			LOGGER.debug(MENSAJE_INSERT_BVISEF);
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			
		   	//mapear los campos
	        filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BVISEF, mapSqlParameterSource);

		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BVISEF, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBVDTRC(Tracs notificacionDeTracs) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		if(notificacionDeTracs == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_TRACS_NULA);
		}else {
		try {
			//*
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BVDTRC, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
		LOGGER.error(ERROR_INSERT_BVDTRC, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBVORDF(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		if(notificacionDeEmisora == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_EMISORA_NULA);
		}else {
		try {
			//insert
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BVORDF, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BVORDF, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBWPMOO(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		if(notificacionDeEmisora == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_EMISORA_NULA);
		}else {
		try {
			//UPDATE
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPMOO, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BWPMOO, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
		
	}

	@Override
	public Boolean registraEnBWPMOF(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos {
		int filasInsertadas = 0;
		if(notificacionDeEmisora == null) {
			throw new ErrorDeBaseDeDatos(ERROR_NOTIF_EMISORA_NULA);
		}else {
		try {
			//update
			MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
			filasInsertadas = namedParameterJdbcTemplate.update(INSERT_BWPMOF, mapSqlParameterSource);
		} catch (DataAccessException dataAccessException) {
			LOGGER.error(ERROR_INSERT_BWPMOF, dataAccessException);
		}
		}
		return (filasInsertadas == 1) ? true : false;
	}

	

}
