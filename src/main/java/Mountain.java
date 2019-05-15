import lombok.Data;
import lombok.NonNull;

@Data
class Mountain {
    private final @NonNull String name;
    private final @NonNull String country;

    private double latitude, longitude;
}
