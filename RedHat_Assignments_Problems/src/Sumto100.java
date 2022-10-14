public class Sumto100 {
    public static void main(String[] args) {

        int i[] = new int[8];
        char[] symbol = { '+', '-', 0 };
        for (i[0] = 0; i[0] < 3; i[0]++) {
            for (i[1] = 0; i[1] < 3; i[1]++) {
                for (i[2] = 0; i[2] < 3; i[2]++) {
                    for (i[3] = 0; i[3] < 3; i[3]++) {
                        for (i[4] = 0; i[4] < 3; i[4]++) {
                            for (i[5] = 0; i[5] < 3; i[5]++) {
                                for (i[6] = 0; i[6] < 3; i[6]++) {
                                    for (i[7] = 0; i[7] < 3; i[7]++) { 

                                        long value = 0;
                                        char prev = '+';
                                        String result = "1";
                                        for (int j = 0; j < 8; j++) {  
                                            char c = symbol[i[j]];
                                            if (c != 0) {
                                                if (prev == '+')
                                                    value += Long.parseLong(result);
                                                if (prev == '-')
                                                    value -= Long.parseLong(result);

                                                prev = c;
                                                result = "";
                                            }

                                            result += (j + 2);
                                        }

                                        if (prev == '+')
                                            value += Long.parseLong(result);
                                        if (prev == '-')
                                            value -= Long.parseLong(result);

                                        if (value == 100) {
                                            result = "1";
                                            for (int j = 0; j < 8; j++) {
                                                char c = symbol[i[j]];
                                                if (c != 0) {
                                                    result += " " + c;
                                                    result += " " + (j + 2);
                                                } else
                                                    result += (j + 2);
                                            }

                                            result += " = 100";
                                            System.out.println(result);
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
