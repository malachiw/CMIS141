//Creates records
public class CrimeRecord {
	private double population,  violentCrime,  violentCrimeRate,
	 murderAndManslaughter, murderAndManslaughterRate, rape,  rapeRate,  robbery,  robberyRate,
	 aggravatedAssualt,  aggravatedAssualtRate,  propertyCrime,  propertyCrimeRate,
	 burglary,  burglaryRate,  larceny,  larcenyRate,  motorVehicleTheft, motorVehicleTheftRate;
	
	private String year;
	
	public CrimeRecord(String year, double population, double violentCrime, double violentCrimeRate, double murderAndManslaughter,
			double murderAndManslaughterRate, double rape, double rapeRate, double robbery, double robberyRate,
			double aggravatedAssualt, double aggravatedAssualtRate, double propertyCrime, double propertyCrimeRate, 
			double burglary, double burglaryRate, double larceny, double larcenyRate, double motorVehicleTheft,
			double motorVehicleTheftRate) {
		this.population = population;
		this.violentCrime = violentCrime;
		this.violentCrimeRate = violentCrimeRate;
		this.murderAndManslaughter = murderAndManslaughter;
		this.murderAndManslaughterRate = murderAndManslaughterRate;
		this.rape = rape;
		this.rapeRate = rapeRate;
		this.robbery = robbery;
		this.robberyRate = robberyRate;
		this.aggravatedAssualt = aggravatedAssualt;
		this.aggravatedAssualtRate = aggravatedAssualtRate;
		this.propertyCrime = propertyCrime;
		this.propertyCrimeRate = propertyCrimeRate;
		this.burglary = burglary;
		this.burglaryRate = burglaryRate;
		this.larceny = larceny;
		this.larcenyRate = larcenyRate;
		this.motorVehicleTheft = motorVehicleTheft;
		this.motorVehicleTheftRate = motorVehicleTheftRate;
		this.year = year;
	}

	/**
	 * @return the population
	 */
	public double getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(double population) {
		this.population = population;
	}

	/**
	 * @return the violentCrime
	 */
	public double getViolentCrime() {
		return violentCrime;
	}

	/**
	 * @param violentCrime the violentCrime to set
	 */
	public void setViolentCrime(double violentCrime) {
		this.violentCrime = violentCrime;
	}

	/**
	 * @return the violentCrimeRate
	 */
	public double getViolentCrimeRate() {
		return violentCrimeRate;
	}

	/**
	 * @param violentCrimeRate the violentCrimeRate to set
	 */
	public void setViolentCrimeRate(double violentCrimeRate) {
		this.violentCrimeRate = violentCrimeRate;
	}

	/**
	 * @return double the murderAndManslaughter
	 */
	public double getMurderAndManslaughter() {
		return murderAndManslaughter;
	}

	/**
	 * @param murderAndManslaughter the murderAndManslaughter to set
	 */
	public void setMurderAndManslaughter(double murderAndManslaughter) {
		this.murderAndManslaughter = murderAndManslaughter;
	}
	
	/**
	 * @return the murderAndManslaughterRate
	 */
	public double getMurderAndManslaughterRate() {
		return murderAndManslaughterRate;
	}

	/**
	 * @param murderAndManslaughterRate the murderAndManslaughterRate to set
	 */
	public void setMurderAndManslaughterRate(double murderAndManslaughterRate) {
		this.murderAndManslaughterRate = murderAndManslaughterRate;
	}

	/**
	 * @return the rape
	 */
	public double getRape() {
		return rape;
	}

	/**
	 * @param rape the rape to set
	 */
	public void setRape(double rape) {
		this.rape = rape;
	}

	/**
	 * @return the rapeRate
	 */
	public double getRapeRate() {
		return rapeRate;
	}

	/**
	 * @param rapeRate the rapeRate to set
	 */
	public void setRapeRate(double rapeRate) {
		this.rapeRate = rapeRate;
	}

	/**
	 * @return the robbery
	 */
	public double getRobbery() {
		return robbery;
	}

	/**
	 * @param robbery the robbery to set
	 */
	public void setRobbery(double robbery) {
		this.robbery = robbery;
	}

	/**
	 * @return the robberyRate
	 */
	public double getRobberyRate() {
		return robberyRate;
	}

	/**
	 * @param robberyRate the robberyRate to set
	 */
	public void setRobberyRate(double robberyRate) {
		this.robberyRate = robberyRate;
	}

	/**
	 * @return the aggravatedAssualt
	 */
	public double getAggravatedAssualt() {
		return aggravatedAssualt;
	}

	/**
	 * @param aggravatedAssualt the aggravatedAssualt to set
	 */
	public void setAggravatedAssualt(double aggravatedAssualt) {
		this.aggravatedAssualt = aggravatedAssualt;
	}

	/**
	 * @return the aggravatedAssualtRate
	 */
	public double getAggravatedAssualtRate() {
		return aggravatedAssualtRate;
	}

	/**
	 * @param aggravatedAssualtRate the aggravatedAssualtRate to set
	 */
	public void setAggravatedAssualtRate(double aggravatedAssualtRate) {
		this.aggravatedAssualtRate = aggravatedAssualtRate;
	}

	/**
	 * @return the propertyCrime
	 */
	public double getPropertyCrime() {
		return propertyCrime;
	}

	/**
	 * @param propertyCrime the propertyCrime to set
	 */
	public void setPropertyCrime(double propertyCrime) {
		this.propertyCrime = propertyCrime;
	}

	/**
	 * @return the propertyCrimeRate
	 */
	public double getPropertyCrimeRate() {
		return propertyCrimeRate;
	}

	/**
	 * @param propertyCrimeRate the propertyCrimeRate to set
	 */
	public void setPropertyCrimeRate(double propertyCrimeRate) {
		this.propertyCrimeRate = propertyCrimeRate;
	}

	/**
	 * @return the burglary
	 */
	public double getBurglary() {
		return burglary;
	}

	/**
	 * @param burglary the burglary to set
	 */
	public void setBurglary(double burglary) {
		this.burglary = burglary;
	}

	/**
	 * @return the burglaryRate
	 */
	public double getBurglaryRate() {
		return burglaryRate;
	}

	/**
	 * @param burglaryRate the burglaryRate to set
	 */
	public void setBurglaryRate(double burglaryRate) {
		this.burglaryRate = burglaryRate;
	}

	/**
	 * @return the larceny
	 */
	public double getLarceny() {
		return larceny;
	}

	/**
	 * @param larceny the larceny to set
	 */
	public void setLarceny(double larceny) {
		this.larceny = larceny;
	}

	/**
	 * @return the larcenyRate
	 */
	public double getLarcenyRate() {
		return larcenyRate;
	}

	/**
	 * @param larcenyRate the larcenyRate to set
	 */
	public void setLarcenyRate(double larcenyRate) {
		this.larcenyRate = larcenyRate;
	}

	/**
	 * @return the motorVehicleTheft
	 */
	public double getMotorVehicleTheft() {
		return motorVehicleTheft;
	}

	/**
	 * @param motorVehicleTheft the motorVehicleTheft to set
	 */
	public void setMotorVehicleTheft(double motorVehicleTheft) {
		this.motorVehicleTheft = motorVehicleTheft;
	}

	/**
	 * @return the motorVehicleTheftRate
	 */
	public double getMotorVehicleTheftRate() {
		return motorVehicleTheftRate;
	}

	/**
	 * @param motorVehicleTheftRate the motorVehicleTheftRate to set
	 */
	public void setMotorVehicleTheftRate(double motorVehicleTheftRate) {
		this.motorVehicleTheftRate = motorVehicleTheftRate;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CrimeRecord [ year= " + year + ", population=" + population + ", violentCrime=" + violentCrime + ", violentCrimeRate="
				+ violentCrimeRate + ", murderAndManslaughter=" + murderAndManslaughter + ", rape=" + rape
				+ ", rapeRate=" + rapeRate + ", robbery=" + robbery + ", robberyRate=" + robberyRate
				+ ", aggravatedAssualt=" + aggravatedAssualt + ", aggravatedAssualtRate=" + aggravatedAssualtRate
				+ ", propertyCrime=" + propertyCrime + ", propertyCrimeRate=" + propertyCrimeRate + ", burglary="
				+ burglary + ", burglaryRate=" + burglaryRate + ", larceny=" + larceny + ", larcenyRate=" + larcenyRate
				+ ", motorVehicleTheft=" + motorVehicleTheft + ", motorVehicleTheftRate=" + motorVehicleTheftRate
				+ "]";
	}
	
}
