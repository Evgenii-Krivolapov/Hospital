package practice.hospital;
public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperature = new float[patientsCount];
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = (float) (Math.random() * 8) + 32;
        }

        return temperature;
    }

    public static String getReport(float[] temperatureData) {
        double totalTemp = 0.0;
        double averegeTemp = 0.0;
        double middleTemp = 0.0;
        int count = 0;
        String stringTempetatureDate = "";
        for (int i = 0; i < temperatureData.length; i++) {
            stringTempetatureDate += String.format("%.1f", temperatureData[i]) + " ";
            totalTemp += temperatureData[i];
            averegeTemp = totalTemp / temperatureData.length;
            middleTemp = Math.round(averegeTemp * 100.00) / 100.00;
            if (temperatureData[i] >= 36.2f && temperatureData[i] <= 36.9f) {
                count++;
            }
        }
            String report =
                    "Температуры пациентов: " + stringTempetatureDate.trim() +
                            "\nСредняя температура: " + middleTemp +
                            "\nКоличество здоровых: " + count;



        return report;
    }
}
/*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */