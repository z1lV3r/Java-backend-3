# Remote Control Competition

## Instructions

In this exercise you will be doing some work on remote control cars team. You are in charge of define the cars used and developed
by your teammates.

## 1. Implement the Interface
Add the generic logic for all the types of cars in an interface.

Please add two methods to the `RemoteControlCar` interface:
- `drive()`, returning nothing, and
- `getDistanceTravelled()`, returning an `int`.

Then make `ProductionRemoteControlCar` and `ExperimentalRemoteControlCar` implement the `RemoteControlCar` interface.
This includes implementing all methods required by the interface.

## 2. Allow cars to drive.
An experimental car has been developed, make sure to assign the correct driven units of distance when every type drives.

Each call of `.drive()` should make the car travel a certain distance:
- a `ProductionRemoteControlCar` drives 10 units,
- an `ExperimentalRemoteControlCar` drives 20 units.

The `.getDistanceTravelled()` method should return the number of units that the car has travelled in its lifetime.

```java
ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
prod.drive();
prod.getDistanceTravelled();
// => 10
        
ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
exp.drive();
exp.getDistanceTravelled();
// => 20
```

## 3. Race!
As an experimental car has been developed, the test track needs to be adapted to handle both production and experimental models. The two types of car have already been built, and you need to find a way to deal with them both on the test track.

Implement the `TestTrack.race(RemoteControlCar car)` method in which the `car`s get to `drive()`.
```java
TestTrack.race(new ProductionRemoteControlCar());
TestTrack.race(new ExperimentalRemoteControlCar());
// any car should be managed by this method
```

## 4. Allow the production cars to be sorted

Only the production cars will be allowed in championships, allow them to be comparable according to their number of victories.

Implement the `Comparable<T>` interface in the `ProductionRemoteControlCar` class.
The default sort order for cars should be descending order of victories.

Use the static `TestTrack.getRankedCars()` method to return the cars passed in, sorted in descending order of number of victories.

<div class="hint">
 <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)" target="_blank">Collections.sort</a> method could help you to complete this task
</div>

```java
ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
prc1.setNumberOfVictories(3);
prc2.setNumberOfVictories(2);
List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
unsortedCars.add(prc1);
unsortedCars.add(prc2);
List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
// => rankings.get(0) == prc2
// => rankings.get(1) == prc1
```

### Created by
- @mikedamay