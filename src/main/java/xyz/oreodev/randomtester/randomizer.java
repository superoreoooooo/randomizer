package xyz.oreodev.randomtester;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

import java.util.Random;

public class randomizer {
    public static int random(int[] percentages) { //0번칸부터 n-1번칸까지 n개 각각 칸에 확률 리턴 : 칸번호 -1: error
        ConsoleCommandSender cons = Bukkit.getConsoleSender();
        Random random = new Random();

        int c = random.nextInt(100);
        int sum = 0;
        int cnt = 0;
        int sum2 = 0;
        int ret = -1;
        int realLeng = 0;

        for (int i = 0; i < percentages.length; i++) {
            if (percentages[i] != 0) realLeng++;
            sum = sum + percentages[i];
            if (sum > 100) return ret;
        }

        Bukkit.broadcastMessage("뽑은 숫자 : " + c);
        /**
        int rem = 100 - sum;
        cons.sendMessage(String.valueOf(c) + " : 뽑은 숫자");
        cons.sendMessage(String.valueOf(rem) + " : 나머지 확률");
        cons.sendMessage(String.valueOf(percentages.length) + " : 확률리스트 길이");
         **/


        for (int s = 0; s < 100; s++) {
            if (cnt >= percentages.length) return realLeng + 1;
            if (percentages[cnt] + sum2 > c) {
                ret = cnt;
                break;
            }
            else {
                sum2 = sum2 + percentages[cnt];
                cnt++;
            }
        }

        return ret;
    }
}
