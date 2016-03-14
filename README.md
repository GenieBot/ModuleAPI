# BotModuleAPI
SpongyBot's public module API

[![Build Status](https://travis-ci.org/Sponges/BotModuleAPI.svg?branch=master)](https://travis-ci.org/Sponges/BotModuleAPI)
[![](https://jitpack.io/v/Sponges/BotModuleAPI.svg)](https://jitpack.io/#Sponges/BotModuleAPI)

### Maven
Coming soon

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
    manager.register(this, myCommand); // "this" is your module instance
}
```

### Documentation
Will add javadocs at some point.

Ensure all modules are safe for a multi-threaded environment.

### License
Working on it
