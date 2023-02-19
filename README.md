# RPG Heroes

## Introduction
This is a console-based RPG Heroes application built in Java using Gradle/Maven. The application allows users to create and customize different types of heroes with unique abilities and equipment, and test them in a battle simulation.

## Requirements
IntelliJ Ultimate with JDK 17
Installation and usage
Clone the repository: git clone https://github.com/malmz90/RPGHeroes_Assignment.git
Import the project in IntelliJ.
Build the project using Gradle/Maven.
Run the application.
Class Diagram
See the class-diagram.png file in the root directory for the class interaction diagram.

## Functionality
The application includes the following functionality:

## Hero classes
The application includes four hero classes: Mage, Ranger, Rogue, and Warrior. Each hero has the following attributes: Name, Level, LevelAttributes, Equipment, ValidWeaponTypes, and ValidArmorTypes.

## Hero attributes
The application implements a Three-Stat System with Strength, Dexterity, and Intelligence attributes for heroes. The attributes are encapsulated in the HeroAttribute class.

## Levelling attributes
Each hero class has different starting attributes and attribute gain rates when levelling up. These are detailed in the appendix.

## Items and equipment
Heroes can equip different types of weapons and armor. The application includes the following weapon types: Axes, Bows, Daggers, and Swords. The following armor types are also available: Head, Body, Legs. Each item has a Name, RequiredLevel, and Slot.

## Custom exceptions
The application includes two custom exceptions: LevelTooLowException and InvalidItemTypeException. These exceptions are thrown when a hero tries to equip an item with a required level higher than their current level or an item of an invalid type.

## Testing
The main functionality of the application has been tested using JUnit.

