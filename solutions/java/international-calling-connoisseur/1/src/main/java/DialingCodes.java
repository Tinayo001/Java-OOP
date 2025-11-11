import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> codes;

    public DialingCodes() {
        codes = new HashMap<>();
    }
    public Map<Integer, String> getCodes() {
        return codes;
    }
    public void setDialingCode(Integer code, String country) {
        // Add or update the entry in the map
        codes.put(code, country);
    }
    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        // Check if the code already exists as a key
        if (codes.containsKey(code)) {
            return; // Do nothing if the code exists
        }
        // Check if the country already exists as a value
        if (codes.containsValue(country)) {
            return; // Do nothing if the country exists
        }
        // If both are new, add them
        codes.put(code, country);
    }
    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : codes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey(); // return dialing code
            }
        }
        return null;
    }
    public void updateCountryDialingCode(Integer code, String country) {
    Integer oldCode = findDialingCode(country);

    if (oldCode == null) {
        return; // country not in map, do nothing
    }

    // Avoid overwriting an existing code for another country
    if (codes.containsKey(code) && !codes.get(code).equals(country)) {
        return; // new code already in use for a different country
    }

    // Remove old entry and add new one
    codes.remove(oldCode);
    codes.put(code, country);
}

}
