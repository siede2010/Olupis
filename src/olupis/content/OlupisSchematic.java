package olupis.content;

import mindustry.game.Schematic;
import mindustry.game.Schematics;

public class OlupisSchematic {

    public static Schematic basicRemnant, basicVestige, basicRelic, basicShrine, basicTemple;

    public static void LoadSchematics(){
        basicRemnant = Schematics.readBase64("bXNjaAF4nGNgYmBiZmDJS8xNZeBJSizOTA5Kzc1LzCth4E5JLU4uyiwoyczPY2BgYMtJTErNKWYQiX6/cIWO0vt5y6JLUhNzYv1zSpViGRmE83NKCzKLdZPzi1J1i6BGMDAwMoABMwBWRx6Z");
        basicVestige = Schematics.readBase64("bXNjaAF4nGNgZmBmZmDJS8xNZeBJSizOTA5LLS7JTE9l4E5JLU4uyiwoyczPY2BgYMtJTErNKWYQiX6/cIWO0vt5y6JLUhNzYv1zSpViGRmE83NKCzKLdZPzi1J1y6BGMDAwghCQAABYYh6e");
        basicRelic = Schematics.readBase64("bXNjaAF4nGNgYWBhZmDJS8xNZeBKSizOTA5KzclMZuBOSS1OLsosKMnMz2NgYGDLSUxKzSlmEIl+v3CFjtL7ecuiS1ITc2L9c0qVYhkZBPNzSgsyi3WT84tSdYvABjAwMIIQkAAAvzcczA==");
        basicShrine = Schematics.readBase64("bXNjaAF4nGNgZWBlZmDJS8xNZeBOSizOTA7OKMrMA3JSUouTizILSjLz8xgYGNhyEpNSc4oZRKLfL1yho/R+3rLoktTEnFj/nFKlWEYGofyc0oLMYt3k/KJU3WKICQwMjAwMTEDIAAAOQB3G");
        basicTemple = Schematics.readBase64("bXNjaAF4nGNgY2BjZmDJS8xNZeBOSizOTA5JzS3IAXJSUouTizILSjLz8xgYGNhyEpNSc4oZRKLfL1yho/R+3rLoktTEnFj/nFKlWEYGofyc0oLMYt3k/KJU3RKICQwMjAwMTEDIAAAOPh3E");
    }
}
