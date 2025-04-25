package com.rslakra.appsuite.tools.pdf;

import com.rslakra.appsuite.core.IOUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @since 04/24/2025 5:12 PM
 */
public class PdfUtilsTest {

    // LOGGER
    private final Logger LOGGER = LoggerFactory.getLogger(PdfUtilsTest.class);

    /**
     *
     */
    @Test
    public void testPathString() {
        String htmlFileName = "Transaction-Fees.html";
        String pdfFileName = "Transaction-Fees.pdf";
        String imageFileName = "Transaction-Fees";
        String filePath = IOUtils.pathString(IOUtils.getUserDir(), "/pdf-tools/target/classes");
        LOGGER.debug("filePath: {}", filePath);
        pdfFileName = IOUtils.pathString(filePath, pdfFileName);
        LOGGER.debug("pdfFileName: {}", pdfFileName);
        htmlFileName = IOUtils.pathString(filePath, htmlFileName);
        LOGGER.debug("htmlFileName: {}", htmlFileName);
    }

    /**
     *
     */
    @Test
    public void testPdfToHtmlGenerator() {
        assertTrue(true);
    }

    /**
     *
     */
    @Test
    public void testHtmlToPDFGenerator() {
        assertTrue(true);
    }

    /**
     *
     */
    @Test
    public void testPdfToImageGenerator() {
        assertTrue(true);
    }

    /**
     *
     */
    @Test
    public void testImageToPDFGenerator() {
        assertTrue(true);
    }


}
