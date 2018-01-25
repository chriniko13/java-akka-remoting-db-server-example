package com.chriniko.akka.examples.akkademydb.server;

import akka.actor.ActorSystem;
import com.chriniko.akka.examples.akkademydb.actor.AkkademyDb;

public class StartServer {

    public static void main(String[] args) {

        ActorSystem actorSystem = ActorSystem.create("akkademy");

        actorSystem.actorOf(AkkademyDb.props(), "akkademy-db");
    }
}
