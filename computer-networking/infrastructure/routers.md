
# Router

* intermediary system (IS)
* comm. links by forwarding packets - reads the addresses and
  uses the routing table/policy to forward to next suitable network
* join multiple computer networks together via wired or wireless connections
* multi-protocol e.g. Appletalk
* Layer 3 network gateway device - Network layer of both OSI-RM and TCP/IP
    * read IP address of layer 3 PDU
    * does not look at SDU
    * may collect statistical data of the forwarding action
* router firmware - support different protocols
  include: [OpenWrt][open-wrt], [DD-WRT][dd-wrt]
* routing table
* network address translation (NAT)
* gateway
* interfaces: Ethernet, Wi-Fi
* handle congestion
    * tail drop, random early detection (RED), weighted RED (WRED)
* handling multiple queues
    * Quality of service (QoS) - Voice over IP (VoIP)
* specialized hardware:
    * application-specific integrated circuit (ASIC)


## types:

* Access routers:
    * from ES
    * small office and home office (SOHO) routers
    * low-cost
* Distribution routers:
    * from access routers
    * enterprise routers
    * core routers

## routing table:

* in-memory database
* stored by the router
* used to determine preferred routes and physical interfaces between systems (both IS and ES)
  for forwarding packets
* static vs dynamic routing (dynamic routing protocol)
* view routing table: `netstat -r`
* default route
    * send all non-local traffic to ISP
* DHCP
* routing policy:
    * override routing table
* DHCP (Dynamic Host Configuration Protocol)


## references:

* [Wikipedia &mdash; Router](https://en.wikipedia.org/wiki/Router_%28computing%29)
* [about.com &mdash; Router](http://compnetworking.about.com/cs/routers/g/bldef_router.htm)
* [dd-wrt][dd-wrt]
* [CIDR Report](http://www.cidr-report.org/as2.0/)


[open-wrt]:http://dd-wrt.com/site/inde://openwrt.org/
[dd-wrt]:http://dd-wrt.com/site/index
