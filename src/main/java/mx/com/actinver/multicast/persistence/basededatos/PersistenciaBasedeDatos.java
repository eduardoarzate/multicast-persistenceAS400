package mx.com.actinver.multicast.persistence.basededatos;

import mx.com.actinver.multicast.error.ErrorDeBaseDeDatos;
import mx.com.actinver.terminal.notificaciones.Emisora;
import mx.com.actinver.terminal.notificaciones.Profundidad;

public interface PersistenciaBasedeDatos {
	
	
	public void registraEnBMV_WARRANTS(c mensajec) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_TRAC(e mensajee) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_ESTADO_INSTRUMENTO(cuatro mensaje4) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_SOCIEDADES_INVERSION(f mensajef) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_UHECHO(P mensajeP) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_DEUDA(b mensajeb) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_CORRO_VENTA(o mensajeo) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_CORRO_COMPRA(o mensajeo) throws ErrorDeBaseDeDatos;
	public void registraEnBMV_ACCIONARIO(a mensajea) throws ErrorDeBaseDeDatos;
	public void registraEnTRMPRFV(Profundidad notificacionDeProfundidad) throws ErrorDeBaseDeDatos;
	public void registraEnTRMPRFC(Profundidad notificacionDeProfundidad) throws ErrorDeBaseDeDatos;
	public void registraEnTRMUHECH(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;
	public void registraEnTRMCORRO(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;
	public void registraEnBWPM202(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;
	public void registraEnBWPM20(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;
	public void registraEnBVDTRC2(Tracs notificacionDeTracs) throws ErrorDeBaseDeDatos;
	public void registraEnBVISEF(Indice notificacionDeIndice) throws ErrorDeBaseDeDatos;
	public void registraEnBVDTRC(Tracs notificacionDeTracs) throws ErrorDeBaseDeDatos;
	public void registraEnBVORDF(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;
	public void registraEnBWPMOO(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;
	public Boolean registraEnBWPMOF(Emisora notificacionDeEmisora) throws ErrorDeBaseDeDatos;

}