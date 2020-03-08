#!/bin/bash
mvn package
java -cp target/area-of-room-1.0-SNAPSHOT.jar com.nttdata.ta.RoomApp
