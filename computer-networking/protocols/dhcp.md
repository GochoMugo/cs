
# Dynamic Host Configuration Protocol (DHCP)

* application-layer protocol
* used in IP networks (both IPv4 and IPv6)
* dynamically distribute network Configurations params, e.g IP addresses
* client-server model
    * server:
        * manage pool of IP address and Configurations e.g. records on
          name servers, time servers, domain name, default gateway
    * client:
        * sends a broadcast query
* request-and-grant, lease, time period, re-claim IP addresses
* IP-address allocation:
    1. dynamic allocation
    2. automatic allocation
        - similar to automatic
        - server maintains history of past IP address assignments
        - allow assigning same IP address to same device, based on MAC addr
    3. manual allocation
        - aka static DHCP, IP address reservation
        - fixed address
        - mapping between IP addr and device MAC addr
* specification - [RFC](https://tools.ietf.org/html/rfc2131) (read!)


## operation:

* connection-less, using UDP
    * udp/67 - server
    * udp/68 - client
* stages (DORA - Discovery, Offer, Request, Acknowledgement)
    * Discovery:
        * finding a server
        * client fires a broadcast request
        * DHCP relay agent used if in different subnets (expand!)
    * Offer:
        * IP lease offer
        * server reserves IP address, sends back offer containing client's
          MAC addr, IP addr being offered, lease duration, IP addr of
          DHCP server making offer
    * Request:
        * IP request
        * client may receive many offers, but should accept only one
        * servers are informed which offer was accepted so that they
          return the IP addr back to pool
    * Acknowledgement:
        * IP lease acknowledgement
        * server sends back requested information
        * client self-configures with the returned parameters
* other requests:
    * information
        * client requests more information
        * for example, browsers getting proxy settings using WPAD
    * releasing
        * is **not** required, as device may disconnect unexpectedly
        * server releases IP address back to pool
* lease database, shared by servers, https://tools.ietf.org/html/draft-ietf-dhc-failover-12 (expand!)


## security:

* attacks:
    1. unauth. servers providing false info.
    2. unauth. clients gaining access to resources
    3. resource auth. attacks from malicious clients


## references:

* [Wikipedia &mdash; DHCP](https://en.wikipedia.org/wiki/Dynamic_Host_Configuration_Protocol)
