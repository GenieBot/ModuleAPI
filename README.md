# BotModuleAPI
SpongyBot's public module API

[![Build Status](https://travis-ci.org/SpongyBot/ModuleAPI.svg?branch=master)](https://travis-ci.org/Sponges/BotModuleAPI)
[![](https://jitpack.io/v/Sponges/BotModuleAPI.svg)](https://jitpack.io/#Sponges/BotModuleAPI)

### Maven
Repository:
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
	...
</repositories>
```

Dependency:
```xml
<dependencies>
	<dependency>
		<groupId>com.github.Sponges</groupId>
    	<artifactId>BotModuleAPI</artifactId>
    	<version>x</version>
	</dependency>
	...
</dependencies>
```
The version `x` should be replaced with the latest built commit. You can find these on the project commits page (https://github.com/SpongyBot/ModuleAPI/commits/master)
 or on JitPack (https://jitpack.io/#Sponges/BotModuleAPI).

Example: `<version>41bae81a4d</version>`

### Usage
#### Simple module:
```java
public class Essentials extends Module { // the main class should extend Module

    public Essentials() {
        super("Essentials", "1.0-SNAPSHOT"); // module name & version
    }

    @Override
    public void onEnable() {
        // in here goes all the code that should run when the module is enabled
    }

    @Override
    public void onDisable() {
        /// in here is the code that should run when the module is disabled
    }
}
```

#### Command:
```java
public class MyCommand extends Command {

    public MyCommand() {
        super("my command description", "mycommand", "mc", "mycmd");
        // description of the command, command name, command aliases
    }

    @Override
    public void onCommand(CommandRequest commandRequest, String[] strings) {
        commandRequest.reply("Hi, this is a reply to your command!");
    }

}
```

Registering the command:
```java
@Override
public void onEnable() {
    CommandManager manager = getCommandManager();
    MyCommand myCommand = new MyCommand();
    manager.register(myCommand);
}
```

#### Events:
Listening to an event:
```java
EventManager manager = getEventManager();
manager.register(SomeEvent.class, event -> {
    // your code goes here 
});
```

Creating your own event:
```java
public class MyEvent extends Event {
	public MyEvent() {
		super(true); // true if the event is cancellable
	}
}
```

Firing an event:
```java
Event event = new MyEvent(); // dummy event for demonstration

EventManager manager = getEventManager();
manager.post(event); // fires the event on the same thread (in sync)
manager.postAsync(event); // fires the event on a new thread (async) - REQUIRED FOR EVENT CANCELLING
```

### Documentation
Will add javadocs at some point.

Ensure all modules are safe for a multi-threaded environment.

### License
Module API code is licensed under the MIT license. Full text included in the `LICENSE` file.
