package weather_hacks_json;

import weather_hacks_json.child.Description;
import weather_hacks_json.child.Forecasts;
import weather_hacks_json.child.Location;
import weather_hacks_json.child.PinpointLocations;
import weather_hacks_json.child.child.Copyright;

public class WeatherHacks {

    public String publicTime;
    public String title;
    public Description description;
    public String link;
    public Forecasts[] forecasts;
    public Location location;
    public PinpointLocations[] pinpointLocations;
    public Copyright copyright;

}
