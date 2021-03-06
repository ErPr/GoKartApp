public class GoKart {
  public static final int MAX_BARS = 8;
  private String mColor;
  private int mBarsCount;
  
  public GoKart(String color) {
    mColor = color;
    mBarsCount = 1;
  }
  
  public String getColor() {
    return mColor;
  }

  public void drive() {
    drive(1);
  }

  public void drive(int laps) {
    // Other driving code omitted for clarity purposes
    mBarsCount -= laps;
  }
  
  public void charge() {
    while (!isFullyCharged()) {
      mBarsCount++;
    }
    System.out.println("Battery is fully charged.");
  }
  
  public boolean isBatteryEmpty() {
    return mBarsCount == 0;
  }

  public boolean isFullyCharged() {
    return mBarsCount == MAX_BARS;
  }

}