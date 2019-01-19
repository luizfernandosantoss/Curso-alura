-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 20-Out-2018 às 03:12
-- Versão do servidor: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `analisebot`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `acompanhamentoanalise`
--
CREATE DATABASE analisebot;

CREATE TABLE `acompanhamentoanalise` (
  `id` int(11) NOT NULL,
  `pergunta_usuario` text NOT NULL,
  `resposta_bot` text NOT NULL,
  `analise_efetuada` text NOT NULL,
  `data_registro` date NOT NULL,
  `analise_auto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `acompanhamentoanalise`
--


-- --------------------------------------------------------

--
-- Estrutura da tabela `historicoassertividade`
--

CREATE TABLE `historicoassertividade` (
  `id` int(11) NOT NULL,
  `pergunta_usuario` text NOT NULL,
  `resposta_bot` text NOT NULL,
  `analise_efetuada` text NOT NULL,
  `data_registro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `historicoassertividade`
--

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acompanhamentoanalise`
--
ALTER TABLE `acompanhamentoanalise`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `historicoassertividade`
--
ALTER TABLE `historicoassertividade`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acompanhamentoanalise`
--
ALTER TABLE `acompanhamentoanalise`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `historicoassertividade`
--
ALTER TABLE `historicoassertividade`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
