package javadois;

import java.text.DecimalFormat;

public class ExecQuatro {

    public static void main(String[] args) {
        float matriz[][] = {
            {4.0f, 5.0f, 7.0f, 3.0f},
            {2.5f, 6.5f, 4.7f, 8.0f},
            {10.0f, 8.5f, 9.5f, 8.0f},
            {9.0f, 6.5f, 7.6f, 8.2f},
            {5.0f, 5.0f, 5.0f, 6.3f},
            {7.0f, 8.0f, 9.0f, 8.5f},
            {5.5f, 3.5f, 2.5f, 1.0f},
            {8.0f, 9.0f, 10.0f, 9.5f},
            {5.6f, 5.8f, 6.5f, 7.0f},
            {7.5f, 8.5f, 9.5f, 10.0f}
        };

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String medias = "";

        for (int i = 0; i < matriz.length; i++) {
            float soma = 0;
            for (int o = 0; o < 4; o++) {
                soma += matriz[i][o];
            }
            float media = soma / 4; 
            medias += decimalFormat.format(media) + " / ";
        }

        System.out.println("Vetor:\n" + medias);
    }
}