/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package info.zamojski.soft.towercollector.analytics;

import info.zamojski.soft.towercollector.model.AnalyticsStatistics;

import android.app.Activity;

public interface IAnalyticsReportingService {

    void setAppOptOut(boolean optOut);

    void sendException(Throwable throwable, boolean isFatal);

    void sendMainActivityStarted();

    void sendMainActivityStopped();

    void sendPreferencesActivityStarted();

    void sendPreferencesActivityStopped();

    void sendUpdateAction(String source);

    void sendMigrationStarted();

    void sendMigrationFinished(long duration, int oldDbVersion, AnalyticsStatistics stats);

    void sendCollectorStarted(IntentSource source);

    void sendCollectorFinished(long duration, String transportMode, AnalyticsStatistics stats);

    void sendUploadStarted(IntentSource source);

    void sendUploadFinished(long duration, String networkType, AnalyticsStatistics stats);

    void sendExportStarted();

    void sendExportFinished(long duration, String fileType, AnalyticsStatistics stats);

    void sendExportDeleteAction();

    void sendExportKeepAction();

    void sendExportUploadAction();

}
