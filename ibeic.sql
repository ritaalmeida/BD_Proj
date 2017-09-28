-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 19-Dez-2016 às 18:54
-- Versão do servidor: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ibeic`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `leilao`
--

CREATE TABLE `leilao` (
  `idleilao` int(11) NOT NULL,
  `idartigoleilao` bigint(20) NOT NULL,
  `datacriacaoleilao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `precomaximoleilao` decimal(65,2) NOT NULL,
  `tituloleilao` varchar(45) NOT NULL,
  `descricaoleilao` varchar(45) NOT NULL,
  `dataterminoleilao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `detalhesleilao` varchar(45) DEFAULT NULL,
  `ativoleilao` tinyint(1) NOT NULL,
  `user_nameuser` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `leilao`
--

INSERT INTO `leilao` (`idleilao`, `idartigoleilao`, `datacriacaoleilao`, `precomaximoleilao`, `tituloleilao`, `descricaoleilao`, `dataterminoleilao`, `detalhesleilao`, `ativoleilao`, `user_nameuser`) VALUES
(1, 123, '2016-12-17 16:59:11', '16.00', 'Cadeiras', 'Metal', '2020-05-17 14:30:00', NULL, 0, 'ferreiro'),
(2, 1234567891011, '2016-12-17 17:04:24', '54.00', 'Mesa', 'Madeira', '2018-05-09 14:30:00', NULL, 0, 'ferreiro'),
(3, 1234568791011, '2016-12-17 18:12:41', '15.00', 'talheres', 'usados nao lavados', '2018-05-09 14:30:00', NULL, 0, 'ines'),
(4, 123, '2016-12-19 01:12:18', '1232.00', '123123', '124', '2017-11-11 22:00:00', NULL, 1, 'rita'),
(5, 123, '2016-12-19 01:13:21', '123456792.00', 'este', 'qawserdtfyuijok', '2017-11-11 23:00:00', NULL, 1, 'rita'),
(6, 123, '2016-12-19 01:17:00', '1232.00', '132', '123', '2017-11-11 22:00:00', NULL, 1, 'rita'),
(7, 12345, '2016-12-19 01:35:59', '12345.00', '12345', '12345', '2017-11-11 22:00:00', NULL, 1, 'rita'),
(8, 1234, '2016-12-19 02:25:33', '124354.00', '123243', '123456', '2017-11-11 22:00:00', NULL, 1, 'rita'),
(9, 12345612345, '2016-12-19 02:26:25', '12345.00', '12345', '123456', '2017-11-11 22:00:00', NULL, 1, 'rita');

--
-- Acionadores `leilao`
--
DELIMITER $$
CREATE TRIGGER `leilao_update` BEFORE UPDATE ON `leilao` FOR EACH ROW BEGIN  
 INSERT INTO `leilao_log` (`idleilao`, `dataalteracaoleilao`, `tituloleilao`, `descricaoleilao`, `detalhesleilao`) VALUES (OLD.idleilao, CURRENT_TIMESTAMP, OLD.tituloleilao, OLD.descricaoleilao, OLD.detalhesleilao);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `leilao_log`
--

CREATE TABLE `leilao_log` (
  `idleilao` int(11) NOT NULL,
  `dataalteracaoleilao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tituloleilao` varchar(45) DEFAULT NULL,
  `descricaoleilao` varchar(45) DEFAULT NULL,
  `detalhesleilao` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `licitacao`
--

CREATE TABLE `licitacao` (
  `idlicitacao` int(11) NOT NULL,
  `datalicitacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `valorlicitacao` decimal(65,2) NOT NULL,
  `user_nameuser` varchar(45) NOT NULL,
  `leilao_idleilao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `licitacao`
--

INSERT INTO `licitacao` (`idlicitacao`, `datalicitacao`, `valorlicitacao`, `user_nameuser`, `leilao_idleilao`) VALUES
(2, '2016-12-19 01:26:37', '12.00', 'rita', 5),
(3, '2016-12-19 01:27:08', '7.00', 'rita', 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `mensagem`
--

CREATE TABLE `mensagem` (
  `idmensagem` int(11) NOT NULL,
  `conteudomensagem` varchar(400) NOT NULL,
  `datamensagem` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_nameuser` varchar(45) NOT NULL,
  `leilao_idleilao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `mensagem`
--

INSERT INTO `mensagem` (`idmensagem`, `conteudomensagem`, `datamensagem`, `user_nameuser`, `leilao_idleilao`) VALUES
(1, 'mama', '2016-12-17 18:02:57', 'ferreiro', 2),
(2, 'esta caro', '2016-12-17 18:05:47', 'ferreiro', 1),
(3, 'qwertyuiop', '2016-12-19 01:26:56', 'rita', 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `nameuser` varchar(45) NOT NULL,
  `passworduser` varchar(45) NOT NULL,
  `isliveuser` tinyint(1) DEFAULT NULL,
  `lastacessuser` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `banuser` tinyint(1) DEFAULT NULL,
  `isadminuser` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `user`
--

INSERT INTO `user` (`nameuser`, `passworduser`, `isliveuser`, `lastacessuser`, `banuser`, `isadminuser`) VALUES
('ferreiro', '123', 0, '2016-12-19 17:53:03', 1, 0),
('guardado', '123', 0, '2016-12-19 17:49:08', 0, 1),
('henrique', '123', 0, '2016-12-19 17:49:04', 0, 1),
('ines', '123', 0, '2016-12-19 17:48:51', 0, 0),
('manuel', '123', 0, '2016-12-19 17:48:46', 0, 0),
('rita', '123', 0, '2016-12-19 17:48:37', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `leilao`
--
ALTER TABLE `leilao`
  ADD PRIMARY KEY (`idleilao`),
  ADD KEY `nameuser_idx` (`user_nameuser`);

--
-- Indexes for table `leilao_log`
--
ALTER TABLE `leilao_log`
  ADD PRIMARY KEY (`idleilao`,`dataalteracaoleilao`);

--
-- Indexes for table `licitacao`
--
ALTER TABLE `licitacao`
  ADD PRIMARY KEY (`idlicitacao`),
  ADD KEY `fk_licitacao_user_idx` (`user_nameuser`),
  ADD KEY `fk_licitacao_leilao1_idx` (`leilao_idleilao`);

--
-- Indexes for table `mensagem`
--
ALTER TABLE `mensagem`
  ADD PRIMARY KEY (`idmensagem`),
  ADD KEY `nameuser_idx` (`user_nameuser`),
  ADD KEY `idleilao_idx` (`leilao_idleilao`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`nameuser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `leilao`
--
ALTER TABLE `leilao`
  MODIFY `idleilao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `licitacao`
--
ALTER TABLE `licitacao`
  MODIFY `idlicitacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `mensagem`
--
ALTER TABLE `mensagem`
  MODIFY `idmensagem` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `leilao`
--
ALTER TABLE `leilao`
  ADD CONSTRAINT `leilao_nameuser` FOREIGN KEY (`user_nameuser`) REFERENCES `user` (`nameuser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `leilao_log`
--
ALTER TABLE `leilao_log`
  ADD CONSTRAINT `leilao_log_idleilao` FOREIGN KEY (`idleilao`) REFERENCES `leilao` (`idleilao`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `licitacao`
--
ALTER TABLE `licitacao`
  ADD CONSTRAINT `licitacao_idleilao` FOREIGN KEY (`leilao_idleilao`) REFERENCES `leilao` (`idleilao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `licitacao_nameuser` FOREIGN KEY (`user_nameuser`) REFERENCES `user` (`nameuser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `mensagem`
--
ALTER TABLE `mensagem`
  ADD CONSTRAINT `mensagem_idleilao` FOREIGN KEY (`leilao_idleilao`) REFERENCES `leilao` (`idleilao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `mensagem_nameuser` FOREIGN KEY (`user_nameuser`) REFERENCES `user` (`nameuser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
