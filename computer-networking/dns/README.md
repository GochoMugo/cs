
# Domain Name System (DNS)

This is a **hierarchical**, networking system for resolving human-friendly
**domin names** to unique **IP addresses**.

* [introduction](#intro)
* [terminology](#term)
* [Domain name](#domain)
    * [TLD](#tld)
* [references](#ref)


<a name="intro"></a>
## introduction:

DNS is one of the most important structure supporting the internet. It
makes it possible to type **duckduckgo.com** in your address bar and **not**
force you to remember the site's IP address (e.g. `176.34.155.20`). The
human mind has proven it difficult to remember several of these numerical
addresses but easy to remember domain names.

> How many domain names have you effortlessly memorized? *duckduckgo.com,
> google.com, youtube.com, twitter.com, github.com, ...*.
>
> How many IP address have you memorized? *127.0.0.1* (anymore?) :)


<a name="term"></a>
## terminology:

* **Domain name**: a human-friendly name associated with an internet
  resource.
* **IP address**: a network-addressable location unique within its network.
* **Name server**: an internet resource that translates domain names to IP
  addresses.


<a name="domain"></a>
## domain name:

The concept of domain name implies the existence of the internet DNS
namespace. This namespace is structured hierarchically<sup>[why?]</sup>.

A domain contains several components:

```bash
   www         .       example      .          com

 3rd Level             2nd Level            Top Level
  Domain                Domain                Domain
```

A **Fully Qualified Domain Name (FQDN)** is an domain name, absolute to the
root of DNS. To signify this absolute property, a FQDN ends with a dot (".").


<a name="tld"></a>
#### Top-Level Domain (TLD)

This is the most general part of the domain, for example, 'com', 'net', 'org',
'gov'and 'edu'.

The management control of these domains is given by [Internet Corporation
for Assigned Names and Numbers (ICANN)](https://www.icann.org/) to certain
parties, which in turn distribute domain names using domain registrars.


<a name="ref"></a>
## references:

* [Learn DNS](http://learndns.com/)
* [DNS Tools for Sysadmins](https://github.com/n1trux/awesome-sysadmin#dns)
