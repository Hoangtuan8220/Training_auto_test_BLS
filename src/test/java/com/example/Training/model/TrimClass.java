package com.example.Training.model;

public class TrimClass {
    public static String trimTest(String input, int method) {
        if (input == null) return "Please enter valid";

        switch (method) {
            case 0:
                // Xoá khoảng trắng đầu và cuối chuỗi
                return input.trim();

            case 1:
                // Xoá khoảng trắng ở đầu chuỗi
                return input.replaceFirst("^\\s+", ""); //replaceFirst: phương thức
            // ^: đầu chuỗi; \\s: khoảng trắng; +: một hoặc nhiều kí tự khoảng trắng

            case 2:
                // Xoá khoảng trắng ở cuối chuỗi
                return input.replaceFirst("\\s+$", ""); // $: cuối chuỗi

            case 3:
                // Giữ lại một space giữa các từ, xoá những space thừa
                return input.trim().replaceAll("\\s{2,}", " ");
            // {2,}: ít nhất 2 lần lặp lại.

            case 4:
                // Xoá toàn bộ khoảng trắng (kể cả giữa các từ)
                return input.replaceAll("\\s+", "");

            default: // không có case nào khớp => vào default
                throw new IllegalArgumentException("Phương pháp không hợp lệ: " + method);
        }
    }


}
