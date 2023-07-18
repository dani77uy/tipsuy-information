package com.github.dani77uy.tipsuy.information.config;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class ExternalResourcesToDB implements CommandLineRunner {

  @Value("app.external.url.countryInfo")
  private String countryInfoURL;

  @Value("app.external.url.cities")
  private String cityInfoURL;

  private static InputStream openZipFile(final String url) throws IOException {
    final byte[] zipBytes = loadZipFromURL(url);
    try (final ZipInputStream zipInputStream = new ZipInputStream(
        new ByteArrayInputStream(zipBytes))) {
      final ZipEntry entry = zipInputStream.getNextEntry();
      if (entry != null) {
        return zipInputStream;
      } else {
        throw new IOException("The zip file is empty.");
      }
    }
  }

  private static byte[] loadZipFromURL(final String url) throws IOException {
    try (final InputStream inputStream = new URL(url).openStream();
        final ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      final byte[] buffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = zipInputStream.read(buffer)) != -1) {
        outputStream.write(buffer, 0, bytesRead);
      }
      return outputStream.toByteArray();
    }
  }

  public void loadCities() {
  }

  @Override
  public void run(final String... args) throws Exception {
    try (final InputStream is = openZipFile(cityInfoURL); final InputStreamReader isr = new InputStreamReader(is); final BufferedReader br = new BufferedReader(isr)) {
      String line;
      final Set<String> list = new HashSet<>();
      while ((line = br.readLine()) != null) {
        list.add(line);
      }

    }
  }

}
