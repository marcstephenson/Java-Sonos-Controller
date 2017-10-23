![Sonos Controller Header](http://blog.vmichalak.com/wp-content/uploads/2017/01/SONOS_controller_header.png)

# sonos-controller
Java API for controlling [SONOS](http://www.sonos.com/) players.

[![Travis Status](https://img.shields.io/travis/vmichalak/sonos-controller.svg)](https://travis-ci.org/vmichalak/sonos-controller)
[![Coverage Status](https://coveralls.io/repos/github/vmichalak/sonos-controller/badge.svg?branch=master)](https://coveralls.io/github/vmichalak/sonos-controller?branch=master)

## Basic Usage

Discovery all Sonos Devices on your network.

```java
List<SonosDevice> devices = SonosDiscovery.discover();
```


Connect to a known Sonos and pause currently playing music.

```java
SonosDevice sonos = new SonosDevice("10.0.0.102");
sonos.pause();
```

## How to clone the project

To clone and recover the dependencies do the following commands:
```
git clone https://github.com/vmichalak/sonos-controller.git
cd sonos-controller
git submodule init
git submodule update
```

## Android Developer 

Add this line to your gradle file.
```
compile group: 'org.apache.httpcomponents' , name: 'httpclient-android' , version: '4.3.5.1'
```

## To-Do

[Link to the Trello](https://trello.com/b/0r87xvWy/sonos-controller)

## Contributors

The current lead maintainer is [Valentin Michalak](https://github.com/vmichalak) [(twitter)](https://twitter.com/valmichalak)

Feel free to participate !

## Join us on Slack !

There is a Sonos Controller group over at [Slack](https://join.slack.com/t/sonoscontroller/shared_invite/enQtMjYwMTQwMzc4ODE3LTQyMmZkMDFlNTQxNjJiZTJmOTZmZjljZmYzYmQxNmM1OTBkMTgyNzFlM2NiZmNjZjA4OWYxY2MxNTAyNTBmN2I). Feel free to drop by for support, ideas or casual conversation related to Sonos Controller and Sonos in general :wink:.

## Special Thanks

Special Thanks to [rahims](https://github.com/rahims) for is work on Sonos API ! 

## Licence

Released under the [MIT license.](LICENCE)
