package practice.hospital;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Hospital {

    private final static Random RND = new Random();
    private final static DecimalFormat FORMATTER_2 = new DecimalFormat("#0.00");

    private final static double MIN_TEMP = 32;
    private final static double MAX_TEMP = 40;
    private final static double MIN_HEALTH_TEMP = 36.2;
    private final static double MAX_HEALTH_TEMP = 36.9;

    public static float averageTemperature = 0;
    public static int healthPatients = 0;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generatePatientsTemperatures(10)));
    }

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperatures[i] = (float) (MIN_TEMP + RND.nextFloat() * (MAX_TEMP - MIN_TEMP));
        }
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperatures[i] = (float) Math.round(patientsTemperatures[i] * 10) / 10;
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        for (float temperatureDatum : temperatureData) {
            averageTemperature = averageTemperature + (float) Math.round(temperatureDatum * 10) / 10;
        }
        for (float temperatureDatum : temperatureData) {
            if (temperatureDatum > MIN_HEALTH_TEMP && temperatureDatum < MAX_HEALTH_TEMP){
                healthPatients++;
            }
        }

        String report =
                "Температуры пациентов: " + Arrays.toString(temperatureData) +
                        "\nСредняя температура: " + FORMATTER_2.format(averageTemperature / temperatureData.length) +
                        "\nКоличество здоровых: " + healthPatients;

        return report;
    }
}