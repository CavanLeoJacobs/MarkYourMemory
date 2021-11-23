Create Schema Mark_your_Memories;
Drop TABLE Albums;
Drop TABLE Photos;

CREATE TABLE Albums
(
AlbumsID bigint not null,
FileFormat varchar(7),
Geolocation varchar(7),
Tags varchar(20),
CapturedDate date,
CapturedBy date
);

CREATE TABLE Photos
(
PhotosID bigint not null,
FileFormat varchar(7),
Geolocation varchar(7),
Tags varchar(20),
CapturedDate date,
CapturedBy date
);
