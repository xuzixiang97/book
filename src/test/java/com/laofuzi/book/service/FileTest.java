//package com.laofuzi.book.service;
//
//import com.itextpdf.text.pdf.BaseFont;
//
//import com.itextpdf.html2pdf.HtmlConverter;
//import com.laofuzi.book.BookApplication;
//import com.laofuzi.book.entity.Book;
//import com.lowagie.text.DocumentException;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.xhtmlrenderer.pdf.ITextFontResolver;
//import org.xhtmlrenderer.pdf.ITextRenderer;
//import util.FileUtil;
//
//import java.io.*;
//import java.util.List;
//import java.util.UUID;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ContextConfiguration(classes = BookApplication.class)
//public class FileTest {
//
//
//    @Test
//    public void testCase() throws Exception {
//        UUID uuid = UUID.randomUUID();
//
//        String htmlString  = "<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "\t<head>\n" +
//                "\t</head>\n" +
//                "\t<body>\n" +
//                "\t\t<div>\n" +
//                "\t\t\t<form>\n" +
//                "\t\t\t\t<h1><a>de</a></h1>\n" +
//                "\t\t\t\t<p>$authorizer$</p>\n" +
//                "\t\t\t\t<b>111</b>\n" +
//                "\t\t\t\t<p>鉴于$authorizer$ （填写申请/参与 单位全称，以下简称“本单位”）在贵行（社）申请/参与办理客户评级授信、信贷业务、对公信用卡等金融产品和服务，本单位就贵行（社）通过电子政务-浙江银保监局-浙江省金融综合服务平台查询和使用本单位相关信息授权如下：</p>\n" +
//                "\t\t\t\t<p>一、本单位同意并不可撤销地授权贵行（社）基于业务办理和贷后管理之目的，通过浙江省金融综合服务平台查询和使用本单位相关信息，相关信息包括但不限于：</p>\n" +
//                "\t\t\t\t<p>本授权书自$authorizer_Identity$起生效。</p>\n" +
//                "\t\t\t\t<p>xzbl</p>\n" +
//                "\t\t\t</form>\n" +
//                "\t\t</div>\n" +
//                "\t\t\n" +
//                "\t</body>\n" +
//                "</html>\n";
//        InputStream inputStream = FileUtil.stringToInputStream(htmlString);
//        File htmlfile = new File("."+uuid.toString()+".html");
//        FileUtil.inputstreamToFile(inputStream,htmlfile);
//        File pdfFile = new File(uuid.toString()+".pdf");
//        //htmlToPdf(file,"."+uuid.toString()+".pdf");
//
//        HtmlConverter.convertToPdf(htmlfile,pdfFile);
//        //StringToPdf(htmlString);
//
//     }
//
//    public static void htmlToPdf(File htmlFile, String pdfPath) throws Exception {
//
//        OutputStream os = new FileOutputStream(pdfPath);
//        ITextRenderer iTextRenderer = new ITextRenderer();
//        iTextRenderer.setDocument(htmlFile);
//
//        //解决中文编码
//        ITextFontResolver fontResolver = iTextRenderer.getFontResolver();
//        if ("linux".equals(getCurrentOperationSystem())) {
//            fontResolver.addFont("/usr/share/fonts/chiness/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//        } else {
//            fontResolver.addFont("c:/Windows/Fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
//        }
//
//        iTextRenderer.layout();
//        iTextRenderer.createPDF(os);
//        os.flush();
//        os.close();
//    }
//
//    private static String getCurrentOperationSystem() {
//        String os = System.getProperty("os.name").toLowerCase();
//        return os;
//    }
//
//
//     public void StringToPdf(String strline) throws FileNotFoundException, DocumentException {
//         UUID uuid = UUID.randomUUID();
//         String htmlString="";
//         htmlString = strline.toString().replaceAll("\"", "'").replaceAll("<style>", "<style>body{font-family:SimSun;font-size:14px;}");    //注意这里为啥要写这个，主要是替换成这样的字体，如果不设置中文有可能显示不出来。
//
//         OutputStream os = new FileOutputStream("."+uuid.toString()+".pdf");    //生成PDF文件的路径
//         ITextRenderer renderer = new ITextRenderer();
//         //ITextFontResolver font = renderer.getFontResolver();
//         //font.addFont("C:/WINDOWS/Fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);//添加中文识别，这里是设置的宋体，Linux下要换成对应的字体
//         renderer.setDocumentFromString(htmlString.toString());
//         renderer.layout();
//         renderer.createPDF(os);
//         renderer.finishPDF();
//     }
//}
