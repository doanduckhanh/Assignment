USE [master]
GO
/****** Object:  Database [LibraryDb]    Script Date: 03/01/2022 16:07:24 ******/
CREATE DATABASE [LibraryDb] ON  PRIMARY 
( NAME = N'LibraryDb', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\LibraryDb.mdf' , SIZE = 2304KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'LibraryDb_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.MSSQLSERVER\MSSQL\DATA\LibraryDb_log.LDF' , SIZE = 504KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [LibraryDb] SET COMPATIBILITY_LEVEL = 100
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [LibraryDb].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [LibraryDb] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [LibraryDb] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [LibraryDb] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [LibraryDb] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [LibraryDb] SET ARITHABORT OFF 
GO

ALTER DATABASE [LibraryDb] SET AUTO_CLOSE ON 
GO

ALTER DATABASE [LibraryDb] SET AUTO_CREATE_STATISTICS ON 
GO

ALTER DATABASE [LibraryDb] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [LibraryDb] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [LibraryDb] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [LibraryDb] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [LibraryDb] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [LibraryDb] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [LibraryDb] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [LibraryDb] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [LibraryDb] SET  ENABLE_BROKER 
GO

ALTER DATABASE [LibraryDb] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [LibraryDb] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [LibraryDb] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [LibraryDb] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [LibraryDb] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [LibraryDb] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [LibraryDb] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [LibraryDb] SET  READ_WRITE 
GO

ALTER DATABASE [LibraryDb] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [LibraryDb] SET  MULTI_USER 
GO

ALTER DATABASE [LibraryDb] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [LibraryDb] SET DB_CHAINING OFF 
GO


USE [LibraryDb]
GO

/****** Object:  Table [dbo].[Author]    Script Date: 03/01/2022 16:08:28 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Author](
	[AuID] [int] NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Information] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Author] PRIMARY KEY CLUSTERED 
(
	[AuID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

/****** Object:  Table [dbo].[Categories]    Script Date: 03/01/2022 16:06:52 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Categories](
	[CateID] [int] NOT NULL,
	[CateName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[CateID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Customer]    Script Date: 03/01/2022 16:08:49 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Customer](
	[CusID] [nvarchar](50) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Address] [nvarchar](50) NOT NULL,
	[State] [nvarchar](50) NOT NULL,
	[City] [nvarchar](50) NOT NULL,
	[Gender] [bit] NOT NULL,
	[Birth] [date] NOT NULL,
	[Phone] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[role] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[CusID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

/****** Object:  Table [dbo].[Order]    Script Date: 03/01/2022 16:09:23 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Order](
	[OrID] [int] NOT NULL,
	[CusID] [nvarchar](50) NOT NULL,
	[BookID] [int] NOT NULL,
	[StartDate] [nvarchar](50) NOT NULL,
	[EndDate] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[OrID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

/****** Object:  Table [dbo].[Book]    Script Date: 03/01/2022 16:06:40 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Book](
	[ID] [int] NOT NULL,
	[Name] [nchar](50) NOT NULL,
	[CategoryID] [int] NOT NULL,
	[AuthorID] [int] NOT NULL,
	[Number] [int] NULL,
	[EntryDate] [date] NOT NULL,
	[Price] [int] NOT NULL,
	[Image] [image] NOT NULL,
 CONSTRAINT [PK_Book] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_Book_Author] FOREIGN KEY([AuthorID])
REFERENCES [dbo].[Author] ([AuID])
GO

ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_Book_Author]
GO

ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_Book_Categories] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Categories] ([CateID])
GO

ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_Book_Categories]
GO

ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Book] FOREIGN KEY([BookID])
REFERENCES [dbo].[Book] ([ID])
GO

ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Book]
GO

ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Customer] FOREIGN KEY([CusID])
REFERENCES [dbo].[Customer] ([CusID])
GO

ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Customer]
GO