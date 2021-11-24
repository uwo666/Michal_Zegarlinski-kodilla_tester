package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Location;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTestSuite {

    WeatherService weatherService  = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendToSubscriberInLocalisation() {
        weatherService.addSubscriberToLocalisation(client,location);

        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        }




    @Test
    public void shouldRemoveSubscriberFromLocalisation() {
        weatherService.removeSubscriberFromLocalisation(client, location);
        weatherService.sendNotificationToLocation(notification,location);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

    @Test
    public void shouldRemoveSubscribeFromAllLocalisation() {

    }

    @Test
    public void notificationShouldReachToGroupOfPeopleInLocation(){
            weatherService.sendNotificationToLocation(notification, location);
            Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldBSendToAllSubscribed() {
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void removeLocation() {


    }
}