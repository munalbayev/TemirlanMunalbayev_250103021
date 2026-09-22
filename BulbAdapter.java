public class BulbAdapter implements SmartDevice{
    private final LegacyBulb bulb;
    public BulbAdapter(LegacyBulb bulb) {
        if (bulb == null) {
            throw new IllegalArgumentException("Bulb is null");
            this.bulb = bulb;
        }
    }
    @Override
    public void turnOn(){
        bulb.setBrightness(255);
    }
    @Override
    public void turnOff(){
        bulb.setBrightness(0);
    }
    @Override
    public boolean isOn() {
        if (!bulb.hasPower()) {
            return false;
        }
        return bulb.readBrightness() > 0;
    }
    @Override
    public int getPowerPercent(){
        if (!bulb.hasPower()) {
            return 0;
        }
    }
}
