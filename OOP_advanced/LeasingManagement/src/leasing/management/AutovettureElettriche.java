package leasing.management;
import interfaces.Autovetture;

public class AutovettureElettriche implements Autovetture {
	private String numeroTarga;
	private String tipoAutovettura;
	private double chilometraggio;
	private int autonomia;
	private double batterie;
	
	public AutovettureElettriche(String numeroTarga, String tipoAutovettura, double chilometraggio, int autonomia, double batterie) {
		this.numeroTarga = numeroTarga;
		this.tipoAutovettura = tipoAutovettura;
		this.chilometraggio = chilometraggio;
		this.autonomia = autonomia;
		this.batterie = batterie;
	}
	
	@Override
	public String getNumeroTarga() {
		// TODO Auto-generated method stub
		return this.numeroTarga;
	}

	@Override
	public String getTipoAutovettura() {
		// TODO Auto-generated method stub
		return this.tipoAutovettura;
	}

	@Override
	public double getChilometraggio() {
		// TODO Auto-generated method stub
		return this.chilometraggio;
	}

	@Override
	public int getAutonomia() {
		// TODO Auto-generated method stub
		return this.autonomia;
	}

	@Override
	public void setNumeroTarga(String nuovaTarga) {
		// TODO Auto-generated method stub
		this.numeroTarga = nuovaTarga;
	}
	
	public double getWattBatterie() {
		return this.batterie;
	}
}
