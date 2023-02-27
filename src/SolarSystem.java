public enum SolarSystem {
    Mars ("Small enough planet"),
    Earth("Unique planet"),
    Saturn("Second largest planet in the solar system"),
    Jupiter("Largest planet in the solar system"),
    Uranus("There is a lot of ice on Uranus"),
    Neptune("Neptune has a lot of heat in its center."),
    Venus("Venus is the second planet from the Sun."),
    Mercury("Mercury is the smallest and closest planet to the Sun in the solar system.");
    private String peculiarities;

    SolarSystem(String peculiarities) {
        this.peculiarities = peculiarities;
    }

    public String getPeculiarities() {
        return peculiarities;
    }

    public void setPeculiarities(String peculiarities) {
        this.peculiarities = peculiarities;
    }

    @Override
    public String toString() {
        return
                 getPeculiarities() + '\''
                ;
    }
}
