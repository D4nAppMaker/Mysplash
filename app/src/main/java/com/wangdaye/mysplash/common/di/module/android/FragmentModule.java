package com.wangdaye.mysplash.common.di.module.android;

import com.wangdaye.mysplash.common.di.module.NetworkModule;
import com.wangdaye.mysplash.common.ui.dialog.ConfirmExitWithoutSaveDialog;
import com.wangdaye.mysplash.common.ui.dialog.DeleteCollectionPhotoDialog;
import com.wangdaye.mysplash.common.ui.dialog.DownloadRepeatDialog;
import com.wangdaye.mysplash.common.ui.dialog.DownloadTypeDialog;
import com.wangdaye.mysplash.common.ui.dialog.PathDialog;
import com.wangdaye.mysplash.common.ui.dialog.ProfileDialog;
import com.wangdaye.mysplash.common.ui.dialog.RequestBrowsableDataDialog;
import com.wangdaye.mysplash.common.ui.dialog.RetryDialog;
import com.wangdaye.mysplash.common.ui.dialog.SelectCollectionDialog;
import com.wangdaye.mysplash.common.ui.dialog.TimePickerDialog;
import com.wangdaye.mysplash.common.ui.dialog.TotalDialog;
import com.wangdaye.mysplash.common.ui.dialog.UpdateCollectionDialog;
import com.wangdaye.mysplash.common.ui.dialog.WallpaperWhereDialog;
import com.wangdaye.mysplash.main.collection.ui.CollectionFragment;
import com.wangdaye.mysplash.main.following.ui.FollowingFeedFragment;
import com.wangdaye.mysplash.main.home.ui.HomeFragment;
import com.wangdaye.mysplash.main.multiFilter.ui.MultiFilterFragment;
import com.wangdaye.mysplash.main.selected.ui.SelectedFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract HomeFragment contributeHomeFragmentInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract CollectionFragment contributeCollectionFragmentInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract FollowingFeedFragment contributeFollowingFeedFragmentInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract MultiFilterFragment contributeMultiFilterFragmentInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract SelectedFragment contributeSelectedFragmentInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract ConfirmExitWithoutSaveDialog contributeConfirmExitWithoutSaveDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract DeleteCollectionPhotoDialog contributeDeleteCollectionPhotoDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract DownloadRepeatDialog contributeDownloadRepeatDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract DownloadTypeDialog contributeDownloadTypeDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract PathDialog contributePathDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract ProfileDialog contributeProfileDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract RequestBrowsableDataDialog contributeRequestBrowsableDataDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract SelectCollectionDialog contributeSelectCollectionDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract TimePickerDialog contributeTimePickerDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract TotalDialog contributeTotalDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract UpdateCollectionDialog contributeUpdateCollectionDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract WallpaperWhereDialog contributeWallpaperWhereDialogInjector();

    @ContributesAndroidInjector(modules = NetworkModule.class)
    abstract RetryDialog contributeRetryDialogInjector();
}
