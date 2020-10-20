package com.mygdx.game;

import static java.lang.Math.abs;

public class Utils {
    public static final float pi = 90;
    public static final float pi2 = 180;
    public static final float piD2 = 45;
    public static final float pi3D2 = 270;


    public static float getAngle(float x1, float y1, float x2, float y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        return (float) Math.toDegrees((float) Math.atan2(dy, dx));
    }

//        public static float lerp(float value1, float value2, float point) {
//            return value1 + (value2 - value1) * point;
//        }

    public static float makeRotation(float angle, float angleTo, float rotationSpeed, float dt) {
        if (angle < angleTo) {
            angle += rotationSpeed * dt;
        } else {
            angle -= rotationSpeed * dt;
        }
        if (abs(angle - angleTo) < 0.5f * rotationSpeed * dt) {
            angle = angleTo;
        }
        return angle;
    }

}
