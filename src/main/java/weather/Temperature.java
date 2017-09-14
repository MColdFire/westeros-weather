package weather;

import java.util.Objects;

class Temperature {

    public enum TemperatureUnit {CELSIUS}

    private final int value;
    private final TemperatureUnit unit;

    Temperature(int value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public int getValue() {
        return value;
    }

    public TemperatureUnit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return value == that.value &&
                unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
