package com.bilgeadam.match;

import com.bilgeadam.match.model.Notification;
import com.bilgeadam.match.model.Priority;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Notification notification1 = new Notification(Priority.LOW,"Bilgi","Hergün yeni bir bilgi.");
        Notification notification2 = new Notification(Priority.HIGH,"Hatırlatma","Alarm kurmayı unutma!");
        Notification notification3 = new Notification(Priority.LOW,"Bilgi Tekrar","Hergün yeni bir bilgi tekrarı!");
        Notification notification4 = new Notification(Priority.MEDIUM,"Spor","Sabah sporun var erken uyu!");


        List<Notification> notifications = Arrays.asList(notification1,notification2,notification3,notification4);


        // Bildirimler içerisinde a içeren bildirim mesajı yok mu?
        boolean isNoneMatch = notifications
                .stream()
                .noneMatch(notification -> notification.getMessage().contains("a"));

        // Bildirimlerin içerisinde mesaj kısmında hepsi mi a içeriyor?
        boolean isAllMatch = notifications
                .stream()
                .allMatch(notification -> notification.getMessage().contains("a"));

        // Bildirimlerin içerisinde mesaj kısmında a içeren herhangi bir bildirim var mı?
        boolean isAnyMatch = notifications
                .stream()
                .anyMatch(notification -> notification.getMessage().contains("a"));


        System.out.println(isNoneMatch + " " + isAllMatch + " " + isAnyMatch);
    }
}
