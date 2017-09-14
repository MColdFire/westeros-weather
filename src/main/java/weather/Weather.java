package weather;

import java.util.Objects;

class Weather {

    private final City city;
    private final Temperature temperature;

    Weather(City city, Temperature temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public City getCity() {
        return city;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(city, weather.city) &&
                Objects.equals(temperature, weather.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, temperature);
    }
}