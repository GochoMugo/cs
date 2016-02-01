DROP TABLE `contacts`;

CREATE TABLE `contacts` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `first_name` varchar(255) default NULL,
  `last_name` varchar(255) default NULL,
  `phone_number` varchar(100) default NULL,
  `email_address` varchar(255) default NULL,
  `home_address` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Troy","Cairo","1-441-940-8892","tristique.pharetra@metusvitaevelit.ca","Ap #356-8405 Tincidunt St."),("Brian","Merritt","1-477-337-9762","dignissim@Nuncut.com","P.O. Box 738, 3738 Accumsan Rd."),("Aimee","Bianca","1-209-636-7216","feugiat@nisi.co.uk","7939 Aliquet Ave"),("Thaddeus","Elvis","1-804-604-8985","placerat@lectus.net","993-3545 Magna, Rd."),("Brielle","Elmo","1-648-550-5938","erat.neque.non@lacuspede.co.uk","399-5928 Quisque Street"),("Cynthia","Mufutau","1-375-348-6557","Etiam.vestibulum.massa@arcuVestibulum.co.uk","P.O. Box 377, 2383 Aliquet. Rd."),("Clio","Echo","1-130-432-8761","dui@cursus.co.uk","Ap #185-9401 Duis Av."),("Tate","Jermaine","1-706-422-8546","Aliquam.ornare.libero@estacmattis.edu","8892 Vel, Road"),("Alana","Justin","1-412-892-5129","vehicula@arcuCurabiturut.ca","598-1953 Cras Avenue"),("Wyoming","Lani","1-958-322-5249","sagittis.Duis.gravida@nullaInteger.org","4488 Interdum. Street");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Randall","Cedric","1-152-743-5382","non.bibendum@utlacusNulla.ca","Ap #673-3695 Fermentum St."),("Cheryl","Logan","1-483-441-8316","gravida.sit.amet@non.ca","P.O. Box 117, 2327 Sagittis Avenue"),("Ezekiel","Ciara","1-208-800-8773","sed@nibhPhasellusnulla.net","P.O. Box 538, 5457 Mi Road"),("Noble","Christen","1-466-880-0863","fringilla.cursus@mauris.org","504-1763 Semper St."),("Branden","Tatyana","1-926-126-1288","aliquet@arcu.co.uk","Ap #424-8443 Nonummy Av."),("Eve","Yen","1-906-818-5157","Aliquam@quisdiam.net","3873 Consectetuer, Avenue"),("Yoshi","Rana","1-487-840-4869","Nulla.dignissim.Maecenas@eget.ca","P.O. Box 536, 1760 Pellentesque St."),("MacKensie","Bo","1-899-901-1406","orci@eleifend.org","2943 Elementum Avenue"),("Nigel","Fuller","1-173-456-2933","Nunc.ullamcorper.velit@nonleoVivamus.edu","Ap #625-9714 Aliquam Ave"),("Minerva","Shoshana","1-843-271-6618","euismod.enim.Etiam@Morbi.co.uk","P.O. Box 791, 1355 Cras Road");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Fritz","Francis","1-784-451-4241","ligula.elit.pretium@etultrices.com","P.O. Box 453, 6764 A Street"),("Tarik","Vance","1-236-380-1109","fringilla.Donec.feugiat@iaculisenim.org","Ap #556-149 Quisque Road"),("Tara","Bo","1-425-664-3159","amet.consectetuer.adipiscing@lobortistellus.ca","270-7578 Enim. Rd."),("Brody","Zephania","1-117-705-4936","Vivamus.euismod.urna@tempordiamdictum.net","Ap #696-9749 Commodo Rd."),("Anika","Rebekah","1-677-670-2740","sagittis.placerat.Cras@gravidaPraesent.org","4785 Sed Rd."),("Alexandra","Maisie","1-850-583-1083","augue@dolornonummy.edu","Ap #496-2823 Mi St."),("Jared","Hanae","1-441-393-0487","ornare@non.net","2262 Sed St."),("Graham","Alana","1-937-787-6470","Duis.a@cursusNuncmauris.ca","1144 Consequat Street"),("Clinton","Brynne","1-911-917-1276","facilisis.vitae@maurisMorbi.edu","Ap #500-1631 Dignissim Avenue"),("Charlotte","Grady","1-199-411-0294","vel@montes.com","248-5566 Metus. Avenue");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Mikayla","Isabelle","1-886-317-8078","penatibus.et.magnis@egestas.com","588-4638 Ultrices St."),("Coby","Wyatt","1-687-591-9490","lorem.eu.metus@vestibulumnequesed.org","678 Orci, Avenue"),("Felix","Liberty","1-831-536-4883","risus.Quisque.libero@Loremipsum.ca","3945 Pellentesque Road"),("Olivia","Wynne","1-907-874-7740","Integer.urna.Vivamus@atfringilla.edu","889-939 Lobortis Ave"),("Savannah","Martin","1-320-730-3869","vel.sapien@ligulaDonec.com","P.O. Box 703, 5205 Sagittis. Avenue"),("Justina","Leila","1-436-847-2859","scelerisque.neque@mattisvelit.net","P.O. Box 414, 4383 Viverra. Av."),("Anne","Yetta","1-198-778-7696","justo@aliquet.co.uk","P.O. Box 114, 5477 Aenean Av."),("Rowan","Marny","1-483-816-8143","at@non.ca","Ap #190-6368 Consequat, Road"),("Donna","Blossom","1-423-225-5031","sit@dolortempus.net","1558 Non St."),("Ciara","Adele","1-540-608-3307","sed.libero@malesuadafringilla.net","523-5130 Velit Rd.");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Laurel","Nina","1-330-924-0350","mollis.lectus.pede@lacus.com","P.O. Box 873, 8272 Elit Road"),("Maxine","Kaden","1-625-184-8193","felis.Donec.tempor@nonleoVivamus.com","Ap #177-3838 Hendrerit Road"),("Cade","Shelley","1-678-892-8622","augue.id@rutrumnon.com","Ap #520-7022 Tristique St."),("Christen","Thane","1-456-501-5702","Quisque@ipsumnonarcu.co.uk","720-4915 Mi Av."),("Levi","Savannah","1-161-191-5934","mollis.dui.in@aliquameros.co.uk","Ap #412-2215 Nisi Ave"),("Ezra","McKenzie","1-214-616-3461","eu.odio@etmalesuada.edu","Ap #853-9596 Ut St."),("Gay","Benjamin","1-291-832-4736","varius.et.euismod@orcitincidunt.co.uk","P.O. Box 576, 285 Nullam Rd."),("Rosalyn","Hanae","1-943-105-3655","aliquam@liberoduinec.ca","897-7195 Inceptos Road"),("Leslie","Dalton","1-164-587-7238","in.consequat.enim@auguescelerisque.co.uk","2206 In Avenue"),("Ruby","Hannah","1-734-116-9684","ultrices@nonmassanon.co.uk","P.O. Box 359, 6831 Lacinia Rd.");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Axel","Arden","1-824-251-2511","Mauris@mollisDuis.co.uk","4404 Pellentesque Ave"),("Victoria","Thane","1-728-831-5228","Maecenas.malesuada@Proinnisl.edu","Ap #842-4644 Sem, Av."),("Quamar","Arthur","1-403-624-4937","tristique@In.edu","P.O. Box 275, 4616 Pellentesque. Av."),("Oren","Upton","1-707-515-6472","natoque.penatibus.et@ametdapibus.co.uk","8317 Lacinia Avenue"),("Dylan","Oliver","1-893-830-3811","egestas@tempus.ca","8647 Mauris Street"),("Phelan","Gillian","1-358-320-3527","ligula.tortor.dictum@faucibus.ca","P.O. Box 127, 2807 Per Rd."),("Bianca","Adrian","1-581-259-1566","odio.Aliquam@blanditcongueIn.com","298 Fringilla Street"),("Carl","Hayes","1-195-751-3891","quis.turpis.vitae@Phasellusnulla.ca","P.O. Box 814, 5535 Pharetra. Ave"),("Mary","Jenna","1-769-556-7112","tempor.lorem.eget@nequeIn.ca","P.O. Box 695, 8563 Aliquam St."),("Martena","Sheila","1-781-979-1929","nibh.enim@Donecfeugiatmetus.org","Ap #315-1827 A St.");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Brynn","Cody","1-602-555-9647","a.aliquet.vel@cursusNunc.net","3619 Accumsan St."),("Jillian","Quentin","1-208-372-6647","orci.lacus@nonante.edu","6107 Gravida. Rd."),("Wing","Kadeem","1-499-686-3301","blandit@lobortisClass.net","P.O. Box 145, 8833 Sagittis Street"),("Leila","Mari","1-174-970-9322","nonummy.ultricies@velitegetlaoreet.edu","6144 Etiam Avenue"),("Jerome","Timon","1-321-385-6981","amet.risus@Nullainterdum.com","Ap #809-5166 Ut Avenue"),("Hyacinth","Emma","1-309-256-2671","Sed@natoquepenatibus.com","Ap #316-4964 Ornare, Ave"),("Grace","Zachary","1-889-718-0780","elementum.sem@Nuncsedorci.com","8533 Rhoncus. Rd."),("Caleb","Indira","1-679-963-0029","quam.elementum@eratvolutpat.com","2014 Nec, Road"),("Teegan","Ruby","1-416-860-3160","luctus@eu.edu","3448 Nulla St."),("Derek","Davis","1-583-265-0539","tincidunt.orci.quis@ornare.org","Ap #187-8256 Dolor. St.");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Daria","Clayton","1-823-793-1091","senectus.et.netus@vel.org","4594 Ante, Ave"),("Adena","Timon","1-877-378-3399","sapien.gravida.non@Cum.com","4292 Ac Street"),("Cailin","Xander","1-871-626-0532","molestie.arcu@et.ca","3441 Egestas. St."),("Hedda","Joy","1-560-811-6687","Fusce@ligulaconsectetuer.ca","Ap #888-4649 Auctor, Rd."),("Sebastian","Fleur","1-603-843-1674","penatibus@dignissimtemporarcu.org","Ap #552-7862 At, Street"),("Sonya","Sasha","1-166-633-9322","vehicula@mauris.net","Ap #785-9981 Dictum Road"),("Philip","Molly","1-547-154-5711","tortor.nibh.sit@senectus.net","P.O. Box 133, 7090 Nulla Rd."),("Cherokee","Channing","1-394-656-0965","elit.pellentesque@enimnisl.edu","508 Nisl Av."),("Velma","Maxine","1-814-881-2190","sem@elitelitfermentum.edu","390-4716 Pharetra Avenue"),("Maia","Myra","1-634-281-4029","Suspendisse@lacusvestibulumlorem.net","Ap #188-4006 Morbi Avenue");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Barrett","Maisie","1-896-944-4461","Pellentesque.habitant.morbi@enimSednulla.co.uk","Ap #429-9728 Est Ave"),("Virginia","Rahim","1-453-833-2935","vitae.velit@feugiat.ca","894-5828 Donec Av."),("Graiden","Wyatt","1-104-734-9381","dignissim.magna.a@IntegerurnaVivamus.com","987-3811 Odio Road"),("Lawrence","Dustin","1-440-849-9705","diam@tempusloremfringilla.co.uk","Ap #429-763 Diam Road"),("Carter","Yoko","1-594-322-2505","libero.Proin.sed@arcu.co.uk","Ap #663-6852 Eget, Rd."),("Rebekah","Whoopi","1-759-132-7294","sit.amet.consectetuer@erategettincidunt.ca","P.O. Box 202, 9620 Rhoncus. Rd."),("Armando","Rina","1-180-782-5790","sed@maurisid.com","Ap #686-8958 Tellus. Av."),("Karen","Kermit","1-566-158-3951","leo@maurisSuspendisse.ca","P.O. Box 684, 6765 Metus St."),("Brenda","Halee","1-523-575-9117","dolor.sit@idante.org","P.O. Box 438, 810 Dolor Rd."),("Anastasia","Alan","1-988-589-5944","risus.Donec@nisi.com","4566 Nec Street");
INSERT INTO `contacts` (`first_name`,`last_name`,`phone_number`,`email_address`,`home_address`) VALUES ("Burton","Angela","1-909-681-9315","Vivamus.rhoncus.Donec@commodo.org","P.O. Box 551, 453 Neque Road"),("Denton","Belle","1-862-802-9148","Nullam@nullaanteiaculis.edu","610-2421 Tortor Avenue"),("Graham","Ignatius","1-931-159-5426","Nulla.facilisis@magnisdisparturient.org","222-9777 Enim, Avenue"),("Ila","Leila","1-944-879-7439","Suspendisse.sagittis.Nullam@Integertinciduntaliquam.com","495-5421 Gravida Road"),("Kaseem","Fredericka","1-332-298-6864","eu.odio.Phasellus@ataugue.org","8991 Commodo Ave"),("Donovan","Tamara","1-537-358-6763","In.ornare@et.co.uk","132 Ac Rd."),("Noah","Suki","1-900-261-3925","Integer.eu.lacus@erosProin.co.uk","1106 Mauris Avenue"),("Prescott","Paul","1-166-956-2298","non.massa@ligulaDonecluctus.ca","P.O. Box 634, 8578 Et Avenue"),("Francis","Eaton","1-367-762-6695","justo.Proin.non@velesttempor.ca","P.O. Box 443, 5211 Pellentesque Street"),("Sheila","Byron","1-544-711-7589","vulputate@Morbinon.org","260-6637 Enim Av.");
